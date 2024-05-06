package com.javaweb.automation.service;

import com.javaweb.automation.model.Product;
import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
}
