package com.ecommerce.cart.service;

import com.ecommerce.cart.mapper.CartItemMapper;
import com.ecommerce.cart.model.CartItem;
import com.ecommerce.cart.repository.CartItemRepository;
import com.ecommerce.cart.viewmodel.CartItemPostVm;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CartItemService {
    private final CartItemRepository cartItemRepository;
    private final CartItemMapper cartItemMapper;

    @Transactional
    public CartItemPostVm createCartItem(CartItemPostVm cartItemPostVm) {
        CartItem cartItem = cartItemMapper.convertToModel(cartItemPostVm);
        cartItem.setCustomerId("test");
        cartItem.setProductId(cartItemPostVm.productId());
        cartItemRepository.save(cartItem);
        return cartItemPostVm;
    }
}
