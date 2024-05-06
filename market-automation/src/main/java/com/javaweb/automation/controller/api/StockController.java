package com.javaweb.automation.controller.api;

import com.javaweb.automation.model.Stock;
import com.javaweb.automation.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Stock>> getAllStock() {
        List<Stock> stockList = stockService.getAllStock();
        return new ResponseEntity<>(stockList, HttpStatus.OK);
    }

    @GetMapping("/{stockId}")
    public ResponseEntity<Stock> getStockByStockId(@PathVariable Long stockId) {
        Stock stock = stockService.getStockByStockId(stockId);
        if (stock != null) {
            return new ResponseEntity<>(stock, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock) {
        Stock savedStock = stockService.saveStock(stock);
        return new ResponseEntity<>(savedStock, HttpStatus.CREATED);
    }

    @PutMapping("/{stockId}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long stockId, @RequestBody Stock stock) {
        Stock existingStock = stockService.getStockByStockId(stockId);
        if (existingStock != null) {
            stock.setStockId(stockId);
            Stock updatedStock = stockService.saveStock(stock);
            return new ResponseEntity<>(updatedStock, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{stockId}")
    public ResponseEntity<Void> deleteStock(@PathVariable Long stockId) {
        Stock existingStock = stockService.getStockByStockId(stockId);
        if (existingStock != null) {
            stockService.deleteStockByStockId(stockId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
