package com.crud.demo.service;

import com.crud.demo.model.User;
import com.crud.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;


class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testUser_shouldReturn500TLWin() {
        //given
        Long userId = 1L;

        User user = new User();
        user.setAge(21);
        user.setCity("ankara");
        user.setId(1L);
        user.setSalary(15.0);
        user.setFirstName("hasan");
        user.setLastName("demircan");
        Optional<User> userOptional = Optional.of(user);

        //when
        when(userRepository.findById(userId)).thenReturn(userOptional);

        //then
        String response = userService.testUser(userId);

        //assert
        assertEquals("500 TL win", response);
    }

}
