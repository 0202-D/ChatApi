package com.myCodeReview.dmitriy.task2.web.controller;

import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class ChatController {
    @Autowired
    ChatService chatService;
    @PostMapping(value = "/chats/add")
    public @ResponseBody
    Long createChat(@RequestBody Chat chat) {
        return chatService.create(chat);
    }

    @PostMapping(value = "/chats/get")
    public @ResponseBody
    Set<Chat> getChats(@RequestBody User user) {
        return chatService.getChats(user);
    }
}
