package com.ecommerce.cart.controller;

import com.ecommerce.cart.service.CartItemService;
import com.ecommerce.cart.viewmodel.CartItemPostVm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartItemController {
    private final CartItemService cartItemService;

    @GetMapping("/cart/items")
    public ResponseEntity<String> getCartItems() {
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("/cart/items")
    public ResponseEntity<CartItemPostVm> createCartItem(@Valid @RequestBody CartItemPostVm cartItemPostVm) {
        CartItemPostVm cartItemPostVm1 = cartItemService.createCartItem(cartItemPostVm);
        return ResponseEntity.ok(cartItemPostVm1);
    }
}
