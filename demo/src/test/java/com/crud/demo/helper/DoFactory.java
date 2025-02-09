package com.crud.demo.helper;

import com.crud.demo.model.User;

import java.util.List;

public class DoFactory {

    public User createUser() {
        User user = new User();
        user.setAge(18);
        user.setCity("ankara");
        user.setId(1L);
        user.setSalary(18.0);
        user.setFirstName("kadir");
        user.setLastName("demircan");

        return user;
    }

    public List<User> createUserList() {
        User user1 = new User();
        user1.setAge(18);
        user1.setCity("istanbul");
        user1.setId(1L);
        user1.setSalary(18.0);
        user1.setFirstName("kadir");
        user1.setLastName("demircan");

        User user2 = new User();
        user2.setAge(35);
        user2.setCity("ankara");
        user2.setId(12L);
        user2.setSalary(23.0);
        user2.setFirstName("hasan");
        user2.setLastName("demir");

        return List.of(user1, user2);
    }
}
