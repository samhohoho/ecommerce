package com.ecommerce.cart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "cart_item")
@IdClass(CartItemId.class)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class CartItem {
    @Id
    private String customerId;
    @Id
    private Long productId;
    private int quantity;
}
