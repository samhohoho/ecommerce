package com.ecommerce.product.controller;

import com.ecommerce.product.model.Product;
import com.ecommerce.product.service.ProductService;
import com.ecommerce.product.viewmodel.ProductPostVm;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping(path = "/api/products")
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam(value = "pageNo", defaultValue = "1", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize
    ) {
        List<Product> response = productService.getProducts(Math.max(1, pageNo), Math.max(1, pageSize));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(path = "/api/products")
    public ResponseEntity<String> createProduct(@RequestBody ProductPostVm productPostVm) {
        productService.createProduct(productPostVm);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
