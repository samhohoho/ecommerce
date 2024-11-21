package com.ecommerce.cart.mapper;

import com.ecommerce.cart.model.CartItem;
import com.ecommerce.cart.viewmodel.CartItemPostVm;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {
    public CartItem convertToModel(CartItemPostVm cartItemPostVm) {
        return CartItem
                .builder()
                .quantity(cartItemPostVm.quantity())
                .build();
    }
}