package com.cnetra.subscriptions.api;

import com.cnetra.subscriptions.resourceproducts.ResourceProductsService;
import com.cnetra.subscriptions.resourceproducts.repository.ResourceProductsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resourceproducts")
@RequiredArgsConstructor
public class ResourceProductsController {
    private final ResourceProductsService resourceproductsservice;

    @GetMapping("/{resource_product_id}")
    private ResourceProductsEntity getResourceProductById(@PathVariable String resource_product_id) {
        return resourceproductsservice.findResourceProductById(resource_product_id);
    }

    @PostMapping("/resourceproduct")
    ResourceProductsEntity create(@RequestBody ResourceProductsEntity resourceproductsentity) {
        return resourceproductsservice.createResourceProduct(resourceproductsentity);
    }

    @GetMapping("/all")
    Iterable<ResourceProductsEntity> findAll() {
        return resourceproductsservice.findAll();
    }

}
