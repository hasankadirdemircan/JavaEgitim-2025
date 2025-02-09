package com.example.microserviceB.controller;

import com.example.microserviceB.model.Customer;
import com.example.microserviceB.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    private ResponseEntity<Customer> getCustomer() {
        return ResponseEntity.ok(customerService.getCustomer());
    }
}
