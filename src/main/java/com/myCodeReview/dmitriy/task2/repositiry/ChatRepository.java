package com.myCodeReview.dmitriy.task2.repositiry;



import com.myCodeReview.dmitriy.task2.entity.Chat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface ChatRepository extends CrudRepository<Chat, Long> {
}
