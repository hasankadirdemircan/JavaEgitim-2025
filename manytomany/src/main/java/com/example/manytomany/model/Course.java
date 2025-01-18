package com.example.manytomany.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String title;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private Set<Student> studentSet = new HashSet<>();
}
