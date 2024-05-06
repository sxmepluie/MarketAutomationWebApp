package com.javaweb.automation.service.impl;

import com.javaweb.automation.model.Stock;
import com.javaweb.automation.repository.StockRepository;
import com.javaweb.automation.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

   
    private final StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    
   
    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    
    @Override
    public Stock getStockByStockId(Long stockId) {
        Optional<Stock> stockOptional = stockRepository.findById(stockId);
        return stockOptional.orElse(null); 
    }

    
    @Override
    public void deleteStockByStockId(Long stockId) {
        stockRepository.deleteById(stockId);
    }


	@Override
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}

}
