package com.cnetra.subscriptions.resourceproductprice.model;

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
public class ResourceProductPrice {
    private Integer resourceMeasurePriceId;
    private Integer vendorAccountId;
    private Integer resourceProductId;
    private String resourceUnitName;
    private Integer resourceUnitId;
    private Float baseUnitPrice;
    private Integer minUnitLimit;
    private Integer maxUnitLimit;
    private Float additionalUnitPrice;
    private String createdBy;
    private Date creationDate;
    private String modifiedBy;
    private Date modifyDate;
    private HashMap<String, Object> extended;
}
