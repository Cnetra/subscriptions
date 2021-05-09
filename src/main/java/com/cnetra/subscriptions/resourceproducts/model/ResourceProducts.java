package com.cnetra.subscriptions.resourceproducts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceProducts {
    private Integer resourceProductId;
    private String resourceProductName;
    private Integer vendorAccountId;
    private String resourceUnitName;
    private Integer resourceUnitId;
    private String resourceUnitOfMeasure;
    private String resourceTimeUnit;
    private String createdBy;
    private Date creationDate;
    private String modifiedBy;
    private Date modifyDate;
    private HashMap<String, Object> extended;
}
