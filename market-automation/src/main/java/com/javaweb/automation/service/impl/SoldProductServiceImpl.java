package com.javaweb.automation.service.impl;

import com.javaweb.automation.model.SoldProduct;
import com.javaweb.automation.repository.SoldProductRepository;
import com.javaweb.automation.service.SoldProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SoldProductServiceImpl implements SoldProductService {

    private final SoldProductRepository soldProductRepository;

    @Autowired
    public SoldProductServiceImpl(SoldProductRepository soldProductRepository) {
        this.soldProductRepository = soldProductRepository;
    }

    @Override
    public SoldProduct save(SoldProduct soldProduct) {
        return soldProductRepository.save(soldProduct);
    }

    @Override
    public List<SoldProduct> getAllSoldProducts() {
        return soldProductRepository.findAll();
    }

    @Override
    public SoldProduct getSoldProductBySoldId(Long soldId) {
        Optional<SoldProduct> optionalSoldProduct = soldProductRepository.findById(soldId);
        return optionalSoldProduct.orElse(null);
    }

    @Override
    @Transactional
    public void deleteSoldProduct(Long soldId) {
        soldProductRepository.deleteById(soldId);
    }

}