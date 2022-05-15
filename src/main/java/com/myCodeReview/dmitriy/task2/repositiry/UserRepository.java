package com.myCodeReview.dmitriy.task2.repositiry;


import com.myCodeReview.dmitriy.task2.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserRepository extends CrudRepository<User, Long> {

}
