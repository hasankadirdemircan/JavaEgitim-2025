package com.example.microserviceA.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private Double salary;
    private String city;
}
