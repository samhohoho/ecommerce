package com.ecommerce.product.mapper;

import com.ecommerce.product.dto.ProductDetail;
import com.ecommerce.product.dto.product.ProductUpdateDto;
import com.ecommerce.product.model.Product;

public class ProductMapperV2 {
    public static Product toModel(long productId, ProductUpdateDto dto) {
        return Product.builder()
                .id(productId)
                .name(dto.getName())
                .brandName(dto.getBrandName())
                .shortDescription(dto.getShortDescription())
                .description(dto.getDescription())
                .build();
    }

    public static ProductDetail toDto(long productId, ProductUpdateDto dto) {
        return ProductDetail.builder()
                .id(productId)
                .name(dto.getName())
                .shortDescription(dto.getShortDescription())
                .description(dto.getDescription())
                .build();
    }
}
