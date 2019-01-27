package com.example.cache.repository;

import com.example.cache.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByName(String name);
}
