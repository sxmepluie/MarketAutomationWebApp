package com.javaweb.automation.service.impl;

import com.javaweb.automation.model.Sale;
import com.javaweb.automation.repository.SaleRepository;
import com.javaweb.automation.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    @Autowired
    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getSaleById(Long id) {
        Optional<Sale> saleOptional = saleRepository.findById(id);
        return saleOptional.orElse(null);
    }

    @Override
    public void deleteSaleById(Long id) {
        saleRepository.deleteById(id);
    }
}
