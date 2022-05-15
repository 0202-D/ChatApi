package com.myCodeReview.dmitriy.task2.web.controller;


import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/users/add")
    public @ResponseBody
    Long createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
