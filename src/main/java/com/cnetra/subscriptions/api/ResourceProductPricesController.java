package com.cnetra.subscriptions.api;

import com.cnetra.subscriptions.resourceproductprice.ResourceProductPriceService;
import com.cnetra.subscriptions.resourceproductprice.repository.ResourceProductPriceEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resourceproductprices")
@RequiredArgsConstructor
public class ResourceProductPricesController {
    private final ResourceProductPriceService resourceproductpriceservice;

    @GetMapping("/{resource_product_id}")
    private Iterable<ResourceProductPriceEntity> findResourceProductPriceByProductId(@PathVariable String resource_product_id) {
        return resourceproductpriceservice.findResourceProductPriceByProductId(resource_product_id);
    }

    @PostMapping("/resourceproductprice")
    ResourceProductPriceEntity create(@RequestBody ResourceProductPriceEntity resourceproductpriceentity) {
        return resourceproductpriceservice.createResourceProductPrice(resourceproductpriceentity);
    }

    @GetMapping("/all")
    Iterable<ResourceProductPriceEntity> findAll() {
        return resourceproductpriceservice.findAll();
    }

}
