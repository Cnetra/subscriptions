package com.cnetra.subscriptions.resourceproducts.repository;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashMap;

@Entity
@Getter
@Setter
@Table(name="resourceproducts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceProductsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="resource_product_id")
    private Integer resourceProductId;

    @Column(name="resource_product_name")
    private String resourceProductName;

    @Column(name="vendor_account_id")
    private Integer vendorAccountId;

    @Column(name="resource_unit_name")
    private String resourceUnitName;

    @Column(name="resource_unit_id")
    private Integer resourceUnitId;

    @Column(name="resource_unit_of_measure")
    private String resourceUnitOfMeasure;

    @Column(name="resource_time_unit")
    private String resourceTimeUnit;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="creation_date")
    private Date creationDate;

    @Column(name="modified_by")
    private String modifiedBy;

    @Column(name="modify_date")
    private Date modifyDate;

    @Column(name="extended")
    private HashMap<String, Object> extended;
}
