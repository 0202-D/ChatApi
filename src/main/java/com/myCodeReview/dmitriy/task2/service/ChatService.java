package com.myCodeReview.dmitriy.task2.service;

import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.User;

import java.util.Set;


public interface ChatService {
    Long create(Chat chat);

    Set<Chat> getChats(User user);
}
