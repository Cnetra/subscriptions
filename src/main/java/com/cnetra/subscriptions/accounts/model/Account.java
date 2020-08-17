package com.cnetra.subscriptions.accounts.model;

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
import java.util.HashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    private Integer id;
    private String tenantId;
    private String accountId;
    private String parentAccountId;
    private String accountType;
    private String associatedVendorId;
    private String companyName;
    private String phone;
    private String email;
    private String fax;
    private String websiteUrl;
    private String dunsNumber;
    private String industryType;
    private String annualRevenue;
    private String numberOfEmployees;
    private String createdBy;
    private String modifiedBy;
    private Date creationDate;
    private Date modifyDate;
    private HashMap<String, Object> extended;
}
