package com.meva.finance.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(value = "categoryFeign", url = "http://meva-category:8980")
public interface CategoryFeign {

    @GetMapping("/alimentacao/{descriptionCompra}")
    Long buscarPorId(@PathVariable String description);


}
