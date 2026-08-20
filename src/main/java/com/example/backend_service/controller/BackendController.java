package com.example.backend_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Backend Service!";
    }
}