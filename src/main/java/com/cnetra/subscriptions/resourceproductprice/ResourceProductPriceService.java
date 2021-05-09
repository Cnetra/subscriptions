package com.cnetra.subscriptions.resourceproductprice;

import com.cnetra.subscriptions.resourceproductprice.model.ResourceProductPrice;
import com.cnetra.subscriptions.resourceproductprice.repository.ResourceProductPriceEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ResourceProductPriceService {
    /**
     *  Create new Resource Product
     * @param resourceproductpriceentity
     * @return Resource Product Price
     */
    ResourceProductPriceEntity createResourceProductPrice(ResourceProductPriceEntity resourceproductpriceentity);

    Iterable<ResourceProductPriceEntity> findResourceProductPriceByProductId(String resource_product_id);

    Iterable<ResourceProductPriceEntity> findAll();

}
