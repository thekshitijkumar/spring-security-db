package com.example.springsecuritydb.repositories;

import com.example.springsecuritydb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUsername(String name);
}
