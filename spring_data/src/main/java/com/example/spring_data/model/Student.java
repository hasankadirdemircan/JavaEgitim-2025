package com.example.spring_data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_no")
    private Long studentNo;

   // @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private int age;
}
