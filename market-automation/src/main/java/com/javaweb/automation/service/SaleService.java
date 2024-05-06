package com.javaweb.automation.service;

import com.javaweb.automation.model.Sale;
import java.util.List;

public interface SaleService {
    Sale save(Sale sale);
    List<Sale> getAllSales();
    Sale getSaleById(Long id);
    void deleteSaleById(Long id);
}
