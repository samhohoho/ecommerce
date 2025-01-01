package com.ecommerce.product.dao;

import com.ecommerce.product.model.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    void insertProduct(Product product);
}
