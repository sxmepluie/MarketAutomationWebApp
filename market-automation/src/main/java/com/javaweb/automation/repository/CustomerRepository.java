package com.javaweb.automation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaweb.automation.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
   
}
