package com.javaweb.automation.service;

import com.javaweb.automation.model.Customer;
import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    void deleteCustomerById(Long id);
}
