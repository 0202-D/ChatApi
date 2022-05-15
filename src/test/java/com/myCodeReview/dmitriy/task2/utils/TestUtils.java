package com.myCodeReview.dmitriy.task2.utils;
import com.myCodeReview.dmitriy.task2.entity.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUtils {

    public static List<User> getUsers() {
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setUsername("Dmitriy");
        user.setCreated_at(new Date());

        User user2 = new User();
        user.setUsername("Petr");
        user.setCreated_at(new Date());

        User user3 = new User();
        user.setUsername("Maria");
        user.setCreated_at(new Date());
        list.add(user);
        list.add(user2);
        list.add(user3);

        return list;
    }
}
