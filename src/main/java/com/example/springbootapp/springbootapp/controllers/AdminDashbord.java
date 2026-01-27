package com.example.springbootapp.springbootapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminDashbord {

    @GetMapping
    public String adminApi() {
        return "Admin Api Routes!";
    }

    @GetMapping("/getAllUsers")
    public String getAllUsers() {
        return "All Users!";
    }

    @GetMapping("/showUserDetails")
    public String showUserDetails() {
        return "User Details!";
    }

    @PostMapping("/createUser")
    public String createUser() {
        return "New User Created!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted!";
    }

}
