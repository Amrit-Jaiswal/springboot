package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class HelloController {

    @GetMapping(value = "{name}")
    public String hello(@PathVariable("name")String name){
        return "Hello " +name;
    }
}