package com.example.microserviceB.service;

import com.example.microserviceB.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("a");
        customer.setLastName("b");
        customer.setSalary(11.9);
        customer.setAge(25);
        customer.setCity("x");

        return customer;
    }
}
