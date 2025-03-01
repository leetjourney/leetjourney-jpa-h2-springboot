/*
 * Copyright (C) 2025 Leetjourney
 * Licensed under the CC BY-NC 4.0 License.
 * See LICENSE file for details.
 */


package com.example.jpa_h2_springboot.service;

import com.example.jpa_h2_springboot.entity.User;
import com.example.jpa_h2_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

