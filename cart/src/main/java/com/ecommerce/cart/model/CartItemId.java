package com.ecommerce.cart.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class CartItemId {
    private String customerId;
    private Long productId;
}
