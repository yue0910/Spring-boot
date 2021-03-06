package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/addUser")
    public void addUser(){
        userService.addUser();
    }

    @GetMapping("updateUser")
    public void updateUser(){
        userService.updateUser();
    }

    @GetMapping("/delete")
    public void delete(){
        userService.deleteUser();
    }
}
