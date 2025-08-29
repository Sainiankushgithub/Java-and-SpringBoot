package com.springcore.entities;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    // Map injected from application.properties
    @Value("#{${student.courses}}")
    private Map<String, String> courses;

    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", courses=" + courses + ", address=" + address + "]";
    }
}
