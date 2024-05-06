package com.javaweb.automation;

import com.javaweb.automation.controller.api.CustomerController;
import com.javaweb.automation.model.Customer;
import com.javaweb.automation.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class MarketAutomationApplicationTests {

    @Autowired
    private CustomerController customerController;

    @MockBean
    private CustomerService customerService;

    @Test
    void testGetAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setCustomerId(1L);
        customer1.setCustomerName("John Doe");
        customer1.setCustomerAddress("123 Main St");
        customers.add(customer1);

        when(customerService.getAllCustomers()).thenReturn(customers);

        ResponseEntity<List<Customer>> response = customerController.getAllCustomers();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(1, response.getBody().size());
        assertEquals(1L, response.getBody().get(0).getCustomerId());
        assertEquals("John Doe", response.getBody().get(0).getCustomerName());
        assertEquals("123 Main St", response.getBody().get(0).getCustomerAddress());
    }

    // Add more test cases for other methods as needed
}
