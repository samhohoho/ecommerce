package com.ecommerce.product.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDetail implements Serializable {
    private long id;
    private String name;
    private String description;
    private String shortDescription;
    private String brandName;
    private String categoryName;
}
