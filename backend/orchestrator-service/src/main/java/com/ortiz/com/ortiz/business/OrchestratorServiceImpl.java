package com.ortiz.com.ortiz.business;

import com.ortiz.dto.ContextFlowDTO;
import com.ortiz.dto.DataDTO;
import com.ortiz.grpc.services.DataServiceGrpc;
import com.ortiz.grpc.services.vfs.ValidationFieldsServiceGrpc;
import com.ortiz.poc.dto.PersonDTO;
import com.ortiz.poc.dto.ValidationFieldDTO;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import reactor.adapter.rxjava.RxJava3Adapter;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;


@Service
@Slf4j
public class OrchestratorServiceImpl {

    private static final Integer MAX_RETRIES = 2;

    @GrpcClient("data-service")
    private DataServiceGrpc.DataServiceBlockingStub dataServiceStub;

    @GrpcClient("validation-fields-service")
    private ValidationFieldsServiceGrpc.ValidationFieldsServiceBlockingStub validationFieldsServiceStub;

    @Autowired
    private DataFilteringService dataFilteringService;

    @Value("${application.data-service.url}")
    private String urlDataService;

    @Value("${application.validation-fields-service.url}")
    private String urlValidationFieldsService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FlowableFactory flowableFactory;

    public Single<DataDTO> saveDataGrpc(DataDTO dataDTO) {
        ContextFlowDTO contextFlow = ContextFlowDTO.builder().data(dataDTO).build();
        return flowableFactory.getPersistenceFlow(new AtomicReference<>(contextFlow));
    }

    public DataDTO saveDataGrpcBlocking(DataDTO dataDTO) {
        return saveDataGrpc(dataDTO)
                .subscribeOn(Schedulers.newThread())
                .toObservable().blockingFirst();
    }

    public Mono<DataDTO> saveDataGrpcMono(DataDTO dataDTO) {
        return RxJava3Adapter.singleToMono(saveDataGrpc(dataDTO));
    }

    @Deprecated // Just to test Rest X Grpc
    public DataDTO saveDataRest(DataDTO dataDTO) {

        ContextFlowDTO context = ContextFlowDTO.builder().data(dataDTO).build();

        return Single.just(context)
                // validate fields on validation fields service
                .map(contextFlow -> {
                    HttpEntity<List<ValidationFieldDTO>> request =
                            new HttpEntity<>(contextFlow.getData().getValidationFields());
                    ResponseEntity<ValidationFieldDTO[]> response = restTemplate.postForEntity(urlValidationFieldsService + "/validation/tenant/1234/fields", request, ValidationFieldDTO[].class);
                    ValidationFieldDTO[] validatedFieldsDTO = response.getBody();
                    contextFlow.setValidatedFields(Arrays.asList(validatedFieldsDTO));
                    return contextFlow;
                })
                // retry when network errors
                .retry(MAX_RETRIES, retryOnlyWhenNetworkError)
                // filter person data from validated fields
                .map(contextFlow -> {
                    List<ValidationFieldDTO> invalidFields = contextFlow.getValidatedFields().stream().filter(validationFieldDTO -> !validationFieldDTO.getServerValidated()).collect(Collectors.toList());
                    PersonDTO personValidateFieldsFiltered = dataFilteringService.filterData(contextFlow.getData().getPerson(), invalidFields);
                    contextFlow.setPersonValidateFieldsFiltered(personValidateFieldsFiltered);
                    return contextFlow;
                })
                // validate person data on data service
                .map(contextFlow -> {
                    HttpEntity<PersonDTO> request = new HttpEntity<>(contextFlow.getPersonValidateFieldsFiltered());
                    ResponseEntity<PersonDTO> response = restTemplate.postForEntity(urlDataService + "/validation/tenant/1234/person", request, PersonDTO.class);
                    PersonDTO personValidatedDTO = response.getBody();
                    contextFlow.setPersonValidated(personValidatedDTO);
                    return contextFlow;
                })
                // persist person data on data service
                .map(contextFlow -> {
                    HttpEntity<PersonDTO> request = new HttpEntity<>(contextFlow.getPersonValidateFieldsFiltered());
                    ResponseEntity<PersonDTO> response = restTemplate.postForEntity(urlDataService + "/tenant/1234/person", request, PersonDTO.class);
                    PersonDTO personPersistedDTO = response.getBody();
                    contextFlow.setPersonPersisted(personPersistedDTO);
                    return contextFlow;
                })
                // retry when network errors
                .retry(MAX_RETRIES, retryOnlyWhenNetworkError)
                // persist validation fields
                .map(contextFlow -> {
                    List<ValidationFieldDTO> validFieldsDTO = contextFlow.getValidatedFields().stream().filter(validationFieldDTO -> validationFieldDTO.getServerValidated()).collect(Collectors.toList());
                    // Updates valid fields with person id persited before
                    List<ValidationFieldDTO> validFieldsPersonIdUpdated = validFieldsDTO.stream().map(validationFieldDTO -> {
                        validationFieldDTO.setPersonId(contextFlow.getPersonPersisted().getId());
                        return validationFieldDTO;
                    }).collect(Collectors.toList());
                    // persisted validated fields
                    HttpEntity<List<ValidationFieldDTO>> request =
                            new HttpEntity<>(validFieldsPersonIdUpdated);
                    String url = String.format("%s/tenant/1234/person/%s/fields", urlValidationFieldsService, contextFlow.getPersonPersisted().getId());
                    ResponseEntity<ValidationFieldDTO[]> response = restTemplate.postForEntity(url, request, ValidationFieldDTO[].class);
                    ValidationFieldDTO[] validatedFieldsDTO = response.getBody();
                    contextFlow.setValidationFieldsPersisted(Arrays.asList(validatedFieldsDTO));
                    return contextFlow;
                })
                // retry when network errors
                .retry(MAX_RETRIES, retryOnlyWhenNetworkError)
                .map(contextFlow -> {
                    return DataDTO.builder().person(contextFlow.getPersonPersisted()).validationFields(contextFlow.getValidationFieldsPersisted()).build();
                })
                .subscribeOn(Schedulers.newThread())
                .toObservable().blockingFirst();
    }

    private Predicate<Throwable> retryOnlyWhenNetworkError = (Throwable throwable) -> {
        if (throwable instanceof StatusRuntimeException) {
            return ((StatusRuntimeException) throwable).getStatus().equals(Status.ABORTED);
        } else if (throwable instanceof HttpClientErrorException) {
            return ((HttpClientErrorException) throwable).getStatusCode().is5xxServerError();
        }
        return false;
    };
}
