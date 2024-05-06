package com.javaweb.automation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaweb.automation.model.SoldProduct;

@Repository
public interface SoldProductRepository extends JpaRepository<SoldProduct, Long> {
   
}
