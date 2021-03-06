package com.example.springsecuritydb.controllers;

import com.example.springsecuritydb.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

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

}
