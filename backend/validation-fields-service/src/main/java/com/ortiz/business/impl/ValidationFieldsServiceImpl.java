package com.ortiz.business.impl;


import com.ortiz.business.IValidationFieldsService;
import com.ortiz.domain.VerifiedFieldDomain;
import com.ortiz.domain.mapper.IVerifiedFieldBusinessMapper;
import com.ortiz.grpc.services.DataServiceGrpc;
import com.ortiz.grpc.services.GetPersonRequest;
import com.ortiz.grpc.services.Person;
import com.ortiz.persistence.repositories.jpa.IFieldJpaRepository;
import com.ortiz.persistence.repositories.service.IVerifyFieldRepository;
import com.ortiz.poc.dto.ValidationFieldDTO;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import static com.ortiz.poc.commons.FieldUtils.getStringValue;


@Service
public class ValidationFieldsServiceImpl implements IValidationFieldsService {

    @Autowired
    private IVerifyFieldRepository verifyFieldRepository;

    @Autowired
    private IFieldJpaRepository fieldJpaRepository;

    @Autowired
    private IVerifiedFieldBusinessMapper fieldsBusinessMapper;

    @GrpcClient("data-service")
    private DataServiceGrpc.DataServiceBlockingStub dataServiceStub;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public List<ValidationFieldDTO> getValidatedFields(String tenantId, String personId) {
        validatePerson(tenantId, personId);
        List<VerifiedFieldDomain> fieldsByPerson = verifyFieldRepository.getVerifiedFieldsByPerson(tenantId, personId);
        return fieldsBusinessMapper.toDtoList(fieldsByPerson);
    }

    @Override
    public List<ValidationFieldDTO> saveVerifiedFields(List<ValidationFieldDTO> validationFieldDTOS) {
        validateFields(validationFieldDTOS);
        List<VerifiedFieldDomain> verifiedFieldDomains = fieldsBusinessMapper.toDomainList(validationFieldDTOS);
        ValidationFieldDTO verifiedFieldDTO = validationFieldDTOS.stream().findFirst().get();
        validatePerson(verifiedFieldDTO.getTenantId(), verifiedFieldDTO.getPersonId());

        final List<VerifiedFieldDomain> savedVerifiedFieldDomains = verifyFieldRepository.saveVerifiedFields(verifiedFieldDomains);
        return fieldsBusinessMapper.toDtoList(savedVerifiedFieldDomains);
    }

    @Override
    public List<ValidationFieldDTO> deleteSavedVerifiedFields(List<ValidationFieldDTO> validationFieldDTOS) {
        List<VerifiedFieldDomain> verifiedFieldDomains = fieldsBusinessMapper.toDomainList(validationFieldDTOS);
        final List<VerifiedFieldDomain> savedVerifiedFieldDomains = verifyFieldRepository.deleteSavedVerifiedFields(verifiedFieldDomains);
        return fieldsBusinessMapper.toDtoList(savedVerifiedFieldDomains);
    }

    @Override
    public List<ValidationFieldDTO> updateVerifiedFields(List<ValidationFieldDTO> validationFieldDTOS) {
        validateFields(validationFieldDTOS);
        ValidationFieldDTO verifiedFieldDTO = validationFieldDTOS.stream().findFirst().get();
        validatePerson(verifiedFieldDTO.getTenantId(), verifiedFieldDTO.getPersonId());
        List<VerifiedFieldDomain> verifiedFieldDomains = fieldsBusinessMapper.toDomainList(validationFieldDTOS);
        List<VerifiedFieldDomain> savedVerifiedFieldDomains = verifyFieldRepository.updateVerifiedFields(verifiedFieldDomains);
        return fieldsBusinessMapper.toDtoList(savedVerifiedFieldDomains);
    }

    private void validatePerson(String tenantId, String personId) {
        GetPersonRequest personRequest = GetPersonRequest.newBuilder().setTenantId(getStringValue(tenantId)).setPersonId(getStringValue(personId)).build();
        try {
            Person personResponse = dataServiceStub.getPerson(personRequest);
        } catch (StatusRuntimeException exc) {
            if (exc.getStatus().getCode() == Status.Code.NOT_FOUND) {
                throw new EntityNotFoundException("Person not found.");
            }
            throw exc;
        }
    }

    public List<ValidationFieldDTO> validateFields(List<ValidationFieldDTO> validationFieldDTOS) {
        List<String> fieldsNamesPersisted = fieldJpaRepository.findAll().stream().map(field -> field.getName()).collect(Collectors.toList());
        List<ValidationFieldDTO> validatedFields = validationFieldDTOS.stream().map(verifiedFieldDTO -> {
            String fieldName = verifiedFieldDTO.getFieldName();
            if (fieldsNamesPersisted.contains(fieldName)) {
                verifiedFieldDTO.setServerValidated(true);
            } else {
                verifiedFieldDTO.setServerValidated(false);
                verifiedFieldDTO.setCause(String.format("Invalid fields: %s.", fieldName));
            }
            if (verifiedFieldDTO.getCreatedDate() == null) {
                verifiedFieldDTO.setServerValidated(false);
                verifiedFieldDTO.setCause("Created date is null");
            }
            return verifiedFieldDTO;
        }).collect(Collectors.toList());
        return validatedFields;
    }
}
