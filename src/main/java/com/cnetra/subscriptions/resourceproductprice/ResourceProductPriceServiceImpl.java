package com.cnetra.subscriptions.resourceproductprice;

import com.cnetra.subscriptions.resourceproductprice.repository.ResourceProductPriceEntity;
import com.cnetra.subscriptions.resourceproductprice.repository.ResourceProductPriceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Slf4j
@RequiredArgsConstructor
public class ResourceProductPriceServiceImpl implements ResourceProductPriceService {

    @Autowired
    private final ResourceProductPriceRepository resourceproductpricerepository;

    /**
     * (@inheritDoc)
     * @param resourceproductpriceentity
     * @return
     */

    public ResourceProductPriceEntity createResourceProductPrice(final ResourceProductPriceEntity resourceproductpriceentity) {
        log.info("Creating resource product price: {}", resourceproductpriceentity);
        return resourceproductpricerepository.save(resourceproductpriceentity);

//        return Mono.fromCallable(() -> transactionTemplate.execute(status -> {
//            return resourceproductpricerepository.save(resourceproductpriceentity);
//        })).subscribeOn(jdbcScheduler);
    }

    /**
     *
     * @param resource_product_id String
     * @return
     */
    public Iterable<ResourceProductPriceEntity> findResourceProductPriceByProductId(final String resource_product_id){
        log.info("Fetch resource product price for : {}", resource_product_id);
        return resourceproductpricerepository.findAllById(Collections.singleton(Integer.parseInt(resource_product_id)));
//        Mono<ResourceProductPriceEntity> resourceproductpriceentityMono = Mono
//                .defer(() -> Mono.just(resourceproductpricerepository.findById(Integer.parseInt((resource_unit_id)))))
//                .subscribeOn(jdbcScheduler);
//
//        return resourceproductpriceentityMono;
    }


    /**
     *
     * @return list of resource product prices
     */
    public Iterable<ResourceProductPriceEntity> findAll(){
        return resourceproductpricerepository.findAll();
//        Flux<ResourceProductPriceEntity> defer = Flux.defer(() -> Flux.fromIterable(resourceproductpricerepository.findAll()));
//        return defer.subscribeOn(jdbcScheduler);
    }

}
