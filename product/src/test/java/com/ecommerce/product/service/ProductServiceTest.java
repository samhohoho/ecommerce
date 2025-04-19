package com.ecommerce.product.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ecommerce.product.dao.ProductMapper;
import com.ecommerce.product.dto.product.ProductGetDto;
import com.ecommerce.product.dto.product.ProductUpdateDto;
import com.ecommerce.product.model.Product;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductMapper productMapper;

    @InjectMocks
    private ProductService productService;

    @Test
    void update_product_by_product_id_successfully() {
        long productId = 1L;
        String productName = "Updated product name";

        ProductUpdateDto productUpdateDto = ProductUpdateDto.builder()
                .name(productName)
                .build();

        when(productMapper.updateProductById(any(Product.class))).thenReturn(1);

        ProductGetDto result = productService.updateProduct(productId, productUpdateDto);

        assertEquals(productId, result.getId());
        assertEquals(productUpdateDto.getName(), result.getName());
        assertEquals(productUpdateDto.getBrandName(), null);
    }
}
