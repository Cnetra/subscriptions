package com.cnetra.subscriptions.accounts.repository;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashMap;

@Entity
@Getter
@Setter
@Table(name="accounts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="tenant_id")
    private String tenantId;

    @Column(name="account_id")
    private String accountId;

    @Column(name="parent_account_id")
    private String parentAccountId;

    @Column(name="type")
    private String accountType;

    @Column(name="associated_vendor_id")
    private String associatedVendorId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="fax")
    private String fax;

    @Column(name="website_url")
    private String websiteUrl;

    @Column(name="duns_number")
    private String dunsNumber;

    @Column(name="industry_type")
    private String industryType;

    @Column(name="annual_revenue")
    private String annualRevenue;

    @Column(name="number_of_employees")
    private String numberOfEmployees;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="modified_by")
    private String modifiedBy;

    @Column(name="creation_date")
    private Date creationDate;

    @Column(name="modify_date")
    private Date modifyDate;

    @Column(name="extended")
    private HashMap<String, Object> extended;
}
