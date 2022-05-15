package com.myCodeReview.dmitriy.task2;


import com.myCodeReview.dmitriy.task2.entity.User;
import com.myCodeReview.dmitriy.task2.utils.TestUtils;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

@ContextConfiguration(classes = Task2Application.class)
class UserRepositoryTest {

    @Autowired
    private Task2Application.UserRepository userRepository;

    private List<User> userList;
    private User user;

    @BeforeEach
    void setUp() {
        userList = TestUtils.getUsers();
        user = userList.get(0);
    }

    @Test
    void getException() {
        try {
            userList.get(5);
            fail();
        } catch (Exception ignored) {
        }
    }
    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }

}