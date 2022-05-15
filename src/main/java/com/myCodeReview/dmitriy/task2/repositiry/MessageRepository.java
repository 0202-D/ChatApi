package com.myCodeReview.dmitriy.task2.repositiry;


import com.myCodeReview.dmitriy.task2.entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;



@Component
public interface MessageRepository extends CrudRepository<Message, Long> {
}
