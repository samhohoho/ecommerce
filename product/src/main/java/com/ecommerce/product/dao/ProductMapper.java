package com.ecommerce.product.dao;

import com.ecommerce.product.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {
    void insertProduct(Product product);
    List<Product> getProduct(Map<String, Object> params);
}
