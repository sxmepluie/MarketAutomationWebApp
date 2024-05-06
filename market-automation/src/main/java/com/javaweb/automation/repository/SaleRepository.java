package com.javaweb.automation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaweb.automation.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
   
}
