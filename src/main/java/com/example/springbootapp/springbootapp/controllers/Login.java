package com.example.springbootapp.springbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @GetMapping("/login")
    public String login() {
        return "Login Page";
    }

    @GetMapping("/logOut")
    public String logOut() {
        return "Logout Page.";
    }

    @GetMapping("/forgotPassword")
    public String forgotPassword() {
        return "Forgot Password";
    }

}
