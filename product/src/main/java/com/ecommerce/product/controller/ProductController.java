package com.ecommerce.product.controller;

import com.ecommerce.product.service.ProductService;
import com.ecommerce.product.viewmodel.ProductPostVm;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class ProductController {
    private final ProductService productService;

    @PostMapping(path = "/api/products")
    public ResponseEntity<String> createProduct(@RequestBody ProductPostVm productPostVm) {
        productService.createProduct(productPostVm);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
