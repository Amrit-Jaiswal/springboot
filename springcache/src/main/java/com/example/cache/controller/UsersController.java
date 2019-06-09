package com.example.cache.controller;

import com.example.cache.cache.UsersCache;
import com.example.cache.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class UsersController {

    @Autowired
    private UsersCache usersCache;

    @GetMapping(value = "/users/{name}")
    public Users getUser(@PathVariable String name){
        System.out.println(name);
        return usersCache.getUser(name);
    }

    @GetMapping(value="/users")
    public List<Users> getAllUsers(){
        return usersCache.getAllUsers();
    }
}
