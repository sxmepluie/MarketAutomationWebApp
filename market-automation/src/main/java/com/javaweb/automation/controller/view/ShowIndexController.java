package com.javaweb.automation.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowIndexController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }
    
    @GetMapping("/murat")
    public String murat() {
        return "index"; 
    }
}