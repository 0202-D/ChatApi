
package com.myCodeReview.dmitriy.task2.service;


import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.Message;

import java.util.Set;

public interface MessageService {
    Long create(Message message);

    Set<Message> getMessages(Chat chat);
}
