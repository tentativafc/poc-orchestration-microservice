package com.ortiz.web;

import com.ortiz.business.IVerifiedFieldsService;
import com.ortiz.dto.VerifiedFieldDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class VerificationFieldController {

    @Autowired
    private IVerifiedFieldsService verifiedFieldsService;

    @GetMapping("/tenant/{tenant_id}/person/{person_id}/fields")
    private List<VerifiedFieldDTO> getFields(@PathVariable(name = "tenant_id") String tenantId, @PathVariable(name = "person_id") String personId) {
        return verifiedFieldsService.getFields(tenantId, personId);
    }

    @PostMapping("/tenant/{tenant_id}/person/{person_id}/fields")
    private List<VerifiedFieldDTO> saveFields(@PathVariable(name = "tenant_id") String tenantId, @PathVariable(name = "person_id") String personId, @RequestBody List<VerifiedFieldDTO> verifiedFields) {
        List<VerifiedFieldDTO> listWithTenantAndPersonId = verifiedFields.stream().map(verifiedFieldDTO -> {
            verifiedFieldDTO.setTenantId(tenantId);
            verifiedFieldDTO.setPersonId(personId);
            return verifiedFieldDTO;
        }).collect(Collectors.toList());
        return verifiedFieldsService.saveFields(listWithTenantAndPersonId);
    }

    @PostMapping("/tenant/{tenant_id}/person/{person_id}")
    private List<VerifiedFieldDTO> updateFields(@PathVariable(name = "tenant_id") String tenantId, @PathVariable(name = "person_id") String personId, @RequestBody List<VerifiedFieldDTO> verifiedFields) {
        List<VerifiedFieldDTO> listWithTenantAndPersonId = verifiedFields.stream().map(verifiedFieldDTO -> {
            verifiedFieldDTO.setTenantId(tenantId);
            verifiedFieldDTO.setPersonId(personId);
            return verifiedFieldDTO;
        }).collect(Collectors.toList());
        return verifiedFieldsService.updateFields(listWithTenantAndPersonId);
    }
}
