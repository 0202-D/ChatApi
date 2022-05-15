package com.myCodeReview.dmitriy.task2.service.impl;

import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.Message;
import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.exception.ChatException;
import com.myCodeReview.dmitriy.task2.repositiry.ChatRepository;
import com.myCodeReview.dmitriy.task2.repositiry.MessageRepository;
import com.myCodeReview.dmitriy.task2.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Autowired
    ChatRepository chatRepository;

    @Override
    public Long create(Message message) {
        Chat chat = chatRepository.findById(message.getChat().getId()).get();

        Set<User> userSet = chat.getUsers();

        long count = userSet.stream()
                .filter(x -> x.getId().equals(message.getAuthor().getId()))
                .count();

        if (count > 0) {
            message.setCreated_at(new Date());
            return messageRepository.save(message).getId();
        }
        else
            throw new ChatException("message not create");
    }

    @Override
    public Set<Message> getMessages(Chat chat) {
        Set<Message> messages = new TreeSet<>();
        messageRepository.findAll().forEach((x) -> {
            if (x.getChat().getId() == chat.getId()) {
                messages.add(x);
            }
        });
        return messages;
    }
}
