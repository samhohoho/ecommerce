package com.ecommerce.product.service;

import com.ecommerce.product.dao.ProductMapper;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.viewmodel.ProductPostVm;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ProductService {
    private final ProductMapper productMapper;

    public void createProduct(ProductPostVm productPostVm) {
        Product product = new Product();
        product.setShortDescription(productPostVm.getShortDescription());
        product.setDescription(productPostVm.getDescription());
        product.setName(productPostVm.getName());
        productMapper.insertProduct(product);
    }
}
