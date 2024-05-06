package com.javaweb.automation.service;

import java.util.List;

import com.javaweb.automation.model.SoldProduct;

public interface SoldProductService {
    SoldProduct save(SoldProduct soldProduct);
    List<SoldProduct> getAllSoldProducts();
    SoldProduct getSoldProductBySoldId(Long soldId); 
    void deleteSoldProduct(Long soldId); 
}