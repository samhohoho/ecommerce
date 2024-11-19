package com.ecommerce.cart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartItemController {
    @GetMapping("/cart/items")
    public ResponseEntity<String> getCartItems() {
        return ResponseEntity.ok("Hello");
    }
}
