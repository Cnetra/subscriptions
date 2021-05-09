package com.cnetra.subscriptions.resourceproducts;

import com.cnetra.subscriptions.resourceproducts.model.ResourceProducts;
import com.cnetra.subscriptions.resourceproducts.repository.ResourceProductsEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ResourceProductsService {
    /**
     *  Create new Resource Product
     * @param resourceproductsentity
     * @return Resource Product
     */
    ResourceProductsEntity createResourceProduct(ResourceProductsEntity resourceproductsentity);

    ResourceProductsEntity findResourceProductById(String resource_product_id);

    Iterable<ResourceProductsEntity> findAll();

}
