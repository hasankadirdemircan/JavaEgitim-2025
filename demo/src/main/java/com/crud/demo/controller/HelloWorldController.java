package com.crud.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "welcome to my first Spring Boot Project!";
    }

    @GetMapping("/hello2")
    public String sayHello2() {
        return "holaa!";
    }

    @GetMapping("/{id}")
    public String getId(@PathVariable("id") Long id) {
        return "you gave me this id : " + id;
    }
}
