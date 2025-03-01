/*
 * Copyright (C) 2025 Leetjourney
 * Licensed under the CC BY-NC 4.0 License.
 * See LICENSE file for details.
 */

package com.example.jpa_h2_springboot.controller;

import com.example.jpa_h2_springboot.entity.User;
import com.example.jpa_h2_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
