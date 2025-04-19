package com.ecommerce.product.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductUpdateDto {
    private String name;
    private String description;
    private String shortDescription;
    private String brandName;
    private String categoryName;
}
