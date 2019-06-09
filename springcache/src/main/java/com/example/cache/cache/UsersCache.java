package com.example.cache.cache;

import com.example.cache.model.Users;
import com.example.cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersCache {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name){
        System.out.println("Retrieving value from database for : "+name);
        Users byName = userRepository.findByName(name);
        return byName;
    }

    @Cacheable(value ="usersCache")
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

}
