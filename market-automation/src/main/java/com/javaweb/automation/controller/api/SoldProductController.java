package com.javaweb.automation.controller.api;

import com.javaweb.automation.model.SoldProduct;
import com.javaweb.automation.service.SoldProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sold-products")
public class SoldProductController {

    private final SoldProductService soldProductService;

    @Autowired
    public SoldProductController(SoldProductService soldProductService) {
        this.soldProductService = soldProductService;
    }

    @GetMapping
    public ResponseEntity<List<SoldProduct>> getAllSoldProducts() {
        List<SoldProduct> soldProducts = soldProductService.getAllSoldProducts();
        return new ResponseEntity<>(soldProducts, HttpStatus.OK);
    }
    
    @GetMapping("/{soldId}")
    public ResponseEntity<SoldProduct> getSoldProductBySoldId(@PathVariable Long soldId) {
        SoldProduct soldProduct = soldProductService.getSoldProductBySoldId(soldId);
        if (soldProduct != null) {
            return new ResponseEntity<>(soldProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<SoldProduct> createSoldProduct(@RequestBody SoldProduct soldProduct) {
    	System.out.println("sales:"+soldProduct.getSaleId());
        SoldProduct savedSoldProduct = soldProductService.save(soldProduct);
        return new ResponseEntity<>(savedSoldProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/{soldId}")
    public ResponseEntity<Void> deleteSoldProduct(@PathVariable Long soldId) {
        SoldProduct existingSoldProduct = soldProductService.getSoldProductBySoldId(soldId);
        if (existingSoldProduct != null) {
            soldProductService.deleteSoldProduct(soldId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
