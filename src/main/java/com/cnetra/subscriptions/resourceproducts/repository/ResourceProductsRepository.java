package com.cnetra.subscriptions.resourceproducts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ResourceProductsRepository extends CrudRepository<ResourceProductsEntity, Integer> {
    List<ResourceProductsEntity> findByResourceProductName(String resourceProductName);
    ResourceProductsEntity findById(int resource_product_id);
}
