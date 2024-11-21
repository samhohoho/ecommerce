package com.ecommerce.cart.repository;

import com.ecommerce.cart.model.CartItem;
import com.ecommerce.cart.model.CartItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, CartItemId> {
}
