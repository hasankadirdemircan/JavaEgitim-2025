package com.example.microserviceA.controller;

import com.example.microserviceA.model.Customer;
import com.example.microserviceA.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateService restTemplateService;

    @GetMapping
    public ResponseEntity<Customer> getCustomer() {
        return ResponseEntity.ok(restTemplateService.getCustomer());
    }
}
