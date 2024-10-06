package com.example.crud.controller;

import com.example.crud.dto.request.UserCreationRequest;
import com.example.crud.dto.request.UserUpdateRequest;
import com.example.crud.entity.User;
import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/users/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "User deleted";
    }
}
