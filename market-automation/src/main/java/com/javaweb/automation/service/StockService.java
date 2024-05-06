package com.javaweb.automation.service;

import com.javaweb.automation.model.Stock;
import java.util.List;

public interface StockService {
    Stock saveStock(Stock stock);
    List<Stock> getAllStock();
    Stock getStockByStockId(Long productId);
    void deleteStockByStockId(Long productId);
}
