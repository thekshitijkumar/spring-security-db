package com.example.springsecuritydb.controllers;

import com.example.springsecuritydb.models.User;
import com.example.springsecuritydb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/student")
    public String greetUser(@RequestParam String name)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello Student "+name;
    }

    @GetMapping("/faculty")
    public String getFaculty(@RequestParam String name)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello faculty "+name;
    }
    @GetMapping("/")
    public String getUser(@RequestParam String name)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello user "+name;
    }


    @PostMapping("/signup_student")
    public void signUp(@RequestBody User user)
    {
        //gives username,password,authority
        //convert password to BCrypt
        //check if username is unique or not
        String encodedPasswd=passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPasswd);
        userRepository.save(user);
    }
}
