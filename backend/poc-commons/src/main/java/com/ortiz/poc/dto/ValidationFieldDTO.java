package com.ortiz.poc.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidationFieldDTO {
    private Long id;
    @JsonIgnore
    private String tenantId;
    @JsonIgnore
    private String personId;
    @JsonProperty("field_name")
    private String fieldName;
    private String value;
    private Integer level;
    private Boolean validated;
    @JsonProperty("created_date")
    private LocalDateTime createdDate;
    private String cause;
    @JsonProperty("server_validated")
    private Boolean serverValidated;
}
