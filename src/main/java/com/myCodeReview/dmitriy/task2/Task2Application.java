package com.myCodeReview.dmitriy.task2;

import com.myCodeReview.dmitriy.task2.entity.Chat;
import com.myCodeReview.dmitriy.task2.entity.Message;
import com.myCodeReview.dmitriy.task2.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
	}

    @Component
    public static interface ChatRepository extends CrudRepository<Chat, Long> {
    }


    @Component
    public static interface MessageRepository extends CrudRepository<Message, Long> {
    }


    @Component
    public static interface UserRepository extends CrudRepository<User, Long> {

    }
}
