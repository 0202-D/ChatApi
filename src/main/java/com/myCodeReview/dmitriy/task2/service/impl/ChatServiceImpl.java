package com.myCodeReview.dmitriy.task2.service.impl;

import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.repositiry.ChatRepository;
import com.myCodeReview.dmitriy.task2.repositiry.UserRepository;
import com.myCodeReview.dmitriy.task2.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Long create(Chat chat) {
        chat.setCreated_at(new Date());
        return chatRepository.save(chat).getId();
    }

    @Override
    public Set<Chat> getChats(User user) {
        return new TreeSet<>(userRepository.findById(user.getId())
                .get().getChats());
    }
}
