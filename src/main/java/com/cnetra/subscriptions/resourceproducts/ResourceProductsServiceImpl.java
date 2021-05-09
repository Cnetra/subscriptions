package com.cnetra.subscriptions.resourceproducts;

import com.cnetra.subscriptions.resourceproducts.model.ResourceProducts;
import com.cnetra.subscriptions.resourceproducts.repository.ResourceProductsEntity;
import com.cnetra.subscriptions.resourceproducts.repository.ResourceProductsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class ResourceProductsServiceImpl implements ResourceProductsService {

    @Autowired
    private final ResourceProductsRepository resourceproductsrepository;

    /**
     * (@inheritDoc)
     * @param resourceproductsentity
     * @return
     */

    public ResourceProductsEntity createResourceProduct(final ResourceProductsEntity resourceproductsentity) {
        log.info("Creating resource product : {}", resourceproductsentity);
        return resourceproductsrepository.save(resourceproductsentity);

//        return Mono.fromCallable(() -> transactionTemplate.execute(status -> {
//            return resourceproductrepository.save(resourceproductentity);
//        })).subscribeOn(jdbcScheduler);
    }

    /**
     *
     * @param resource_product_id String
     * @return
     */
    public ResourceProductsEntity findResourceProductById(final String resource_product_id){
        log.info("Fetch resource product for : {}", resource_product_id);
        return resourceproductsrepository.findById(Integer.parseInt(resource_product_id));
//        Mono<ResourceProductsEntity> resourecproductsentityMono = Mono
//                .defer(() -> Mono.just(resourceproductsrepository.findById(Integer.parseInt((resource_product_id)))))
//                .subscribeOn(jdbcScheduler);
//
//        return resourceproductsentityMono;
    }

    /**
     *
     * @return list of resource products
     */
    public Iterable<ResourceProductsEntity> findAll(){
        return resourceproductsrepository.findAll();
//        Flux<ResourceProductsEntity> defer = Flux.defer(() -> Flux.fromIterable(resourceproductsrepository.findAll()));
//        return defer.subscribeOn(jdbcScheduler);
    }

}
