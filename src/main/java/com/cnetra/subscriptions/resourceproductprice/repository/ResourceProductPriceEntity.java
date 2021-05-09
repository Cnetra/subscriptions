package com.cnetra.subscriptions.resourceproductprice.repository;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashMap;

@Entity
@Getter
@Setter
@Table(name="resourceproductprice")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceProductPriceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="resource_measure_price_id")
    private Integer resourceMeasurePriceId;

    @Column(name="vendor_account_id")
    private Integer vendorAccountId;

    @Column(name="resource_product_id")
    private Integer resourceProductId;

    @Column(name="resource_unit_name")
    private String resourceUnitName;

    @Column(name="resource_unit_id")
    private Integer resourceUnitId;

    @Column(name="base_unit_price")
    private Float baseUnitPrice;

    @Column(name="min_unit_limit")
    private Integer minUnitLimit;

    @Column(name="max_unit_limit")
    private Integer maxUnitLimit;

    @Column(name="additional_unit_price")
    private Float additionalUnitPrice;

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
