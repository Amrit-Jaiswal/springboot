package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
