package com.javaweb.automation.controller.view;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowProductController {

    @GetMapping("/products")
    public String showProductsPage() {
        return "products"; 
    }
}