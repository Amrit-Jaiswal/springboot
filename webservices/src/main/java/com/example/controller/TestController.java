package com.example.controller;

import com.example.service.Circle;
import com.example.service.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

    @Autowired
    private Circle circle;

    @Autowired
    private Rectangle rectangle;

    @GetMapping("/get")
    public String getValue(){
        circle.draw();
        rectangle.draw();
        return "Hello";
    }
}
