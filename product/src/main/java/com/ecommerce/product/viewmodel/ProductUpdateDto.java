package com.ecommerce.product.viewmodel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductUpdateDto {
    private String name;
    private String shortDescription;
    private String description;
    private String brandName;
    private String categoryName;
}
