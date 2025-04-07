package com.ecommerce.product.service;

import com.ecommerce.product.dao.ProductMapper;
import com.ecommerce.product.dto.ProductDetail;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.viewmodel.ProductPostVm;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Product> getProducts(int pageNo, int pageSize) {
        int offset = (pageNo - 1) * pageSize;
        Map<String, Object> params = new HashMap<>();
        params.put("offset", offset);
        params.put("pageSize", pageSize);
        return productMapper.getProduct(params);
    }

    public ProductDetail getProductById(long productId) {
        ProductDetail productDetail = productMapper.getProductById(productId);

        return productDetail;
    }
}
