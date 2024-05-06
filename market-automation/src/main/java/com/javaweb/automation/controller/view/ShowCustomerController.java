package com.javaweb.automation.controller.view;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowCustomerController {

    @GetMapping("/customers")
    public String showCustomersPage() {
        return "customers"; 
    }
}
