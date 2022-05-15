package com.myCodeReview.dmitriy.task2.service.impl;

import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.repositiry.UserRepository;
import com.myCodeReview.dmitriy.task2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Long create(User user) {
        user.setCreated_at(new Date());
        return userRepository.save(user).getId();
    }
}
