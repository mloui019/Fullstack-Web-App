package com.example.backend.controller;

import com.example.backend.dto.UserRegistrationDTO;
import com.example.backend.entity.User;
import com.example.backend.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /* Register a new account */
    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegistrationDTO user) {
        userService.register(user);

        return ResponseEntity.ok("Account Successfully created!");
    }

    /* Login to an existing account */
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {

        return null;
    }

    /* Get a user profile */
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getProfile(@PathVariable Long id) {
        
        return null;
    }

}
