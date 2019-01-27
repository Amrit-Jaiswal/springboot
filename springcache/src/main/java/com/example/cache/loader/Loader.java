package com.example.cache.loader;

import com.example.cache.model.Users;
import com.example.cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void load(){
        List<Users> usersList = getUserList();
        userRepository.saveAll(usersList);
    }

    private List<Users> getUserList(){
        List<Users> list = new ArrayList<>();
        list.add(new Users("Balaji",2000000L));
        list.add(new Users("Anamika",10000L));
        list.add(new Users("Shreya",300000L));
        return list;
    }
}
