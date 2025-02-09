package com.crud.demo.service;

import com.crud.demo.model.User;
import com.crud.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> {
            log.error("user does not exists userid : {}", id);
            return new RuntimeException("user does not exists");
        });
    }

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
