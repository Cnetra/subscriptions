package com.cnetra.subscriptions.resourceproductprice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ResourceProductPriceRepository extends CrudRepository<ResourceProductPriceEntity, Integer> {
    List<ResourceProductPriceEntity> findByResourceProductId(String resourceProductId);
    ResourceProductPriceEntity findById(int resource_product_id);
    List<ResourceProductPriceEntity> findByResourceProductId(int resource_product_id);
}
