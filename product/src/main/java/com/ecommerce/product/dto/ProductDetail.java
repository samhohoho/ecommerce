package com.ecommerce.product.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDetail {
    private long id;
    private String name;
    private String description;
    private String shortDescription;
    private String brandName;
    private String categoryName;
}
