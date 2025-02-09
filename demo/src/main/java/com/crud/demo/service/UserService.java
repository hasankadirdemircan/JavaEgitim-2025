package com.crud.demo.service;

import com.crud.demo.model.User;

import java.util.List;

public interface UserService {

    void deleteUserById(Long id);

    User createUser(User user);

    List<User> getUserList();

    User getUserById(Long id);

    String testUser(Long id);
}
