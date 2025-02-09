package com.example.microserviceA.service;

import com.example.microserviceA.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

    private final RestTemplate restTemplate;

    public Customer getCustomer() {
        Customer customer = restTemplate.exchange("http://127.0.0.1:8090/api/customers",
                HttpMethod.GET,
                null,
                Customer.class
        ).getBody();
        return customer;
    }
}
