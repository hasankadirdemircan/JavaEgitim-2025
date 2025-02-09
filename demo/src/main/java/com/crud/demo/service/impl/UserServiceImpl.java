package com.crud.demo.service.impl;

import com.crud.demo.model.User;
import com.crud.demo.repository.UserRepository;
import com.crud.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> {
            log.error("user does not exists userid : {}", id);
            return new RuntimeException("user does not exists");
        });
    }

    @Override
    public String testUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> {
            log.error("user does not exists userid : {}", id);
            return new RuntimeException("user does not exists");
        });

        if (user.getAge() > 20 && user.getAge() < 40) {
            return "500 TL win";
        } else if (user.getAge() > 40) {
            return "1000 TL win";
        } else {
            return "10 TL win";
        }
    }
}
