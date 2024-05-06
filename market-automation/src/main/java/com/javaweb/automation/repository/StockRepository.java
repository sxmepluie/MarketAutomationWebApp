package com.javaweb.automation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaweb.automation.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
   
}