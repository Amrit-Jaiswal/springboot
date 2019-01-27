package com.example.cache.controller;

import com.example.cache.cache.UsersCache;
import com.example.cache.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    @Autowired
    private UsersCache usersCache;

    @GetMapping(value = "{name}")
    public Users getUser(@PathVariable String name){
        System.out.println(name);
        return usersCache.getUser(name);
    }
}
