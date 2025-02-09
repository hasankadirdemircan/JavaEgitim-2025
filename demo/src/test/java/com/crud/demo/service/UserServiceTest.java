package com.crud.demo.service;

import com.crud.demo.helper.DoFactory;
import com.crud.demo.model.User;
import com.crud.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private DoFactory doFactory;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        doFactory = new DoFactory();
    }

    @Test
    void testUser_shouldReturn500TLWin() {
        //given
        Long userId = 1L;
        User user = doFactory.createUser();
        user.setAge(21);
        Optional<User> userOptional = Optional.of(user);

        //when
        when(userRepository.findById(userId)).thenReturn(userOptional);

        //then
        String response = userService.testUser(userId);

        //assert
        assertEquals("500 TL win", response);
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    void testUser_shouldReturn1000TLwin() {
        //given
        Long userId = 1L;

        User user = doFactory.createUser();
        user.setAge(42);
        Optional<User> userOptional = Optional.of(user);

        //when
        when(userRepository.findById(userId)).thenReturn(userOptional);

        //then
        String response = userService.testUser(userId);

        //assert
        assertEquals("1000 TL win", response);
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    void testUser_shouldReturn10TLwin() {
        //given
        Long userId = 1L;

        User user = doFactory.createUser();
        Optional<User> userOptional = Optional.of(user);

        //when
        when(userRepository.findById(userId)).thenReturn(userOptional);

        //then
        String response = userService.testUser(userId);

        //assert
        assertEquals("10 TL win", response);
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    void testUser_shouldThrowRuntimeExceptionUserNotFound() {
        //given
        Long userId = 1L;

        //when
        when(userRepository.findById(userId)).thenReturn(Optional.empty());

        //then
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            userService.testUser(userId);
        });

        //assert
        assertEquals("user does not exists", exception.getMessage());
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    void getUserList_shouldReturnUserList() {
        //given
        List<User> userList = doFactory.createUserList();

        //when
        when(userRepository.findAll()).thenReturn(userList);

        //then
        List<User> response = userService.getUserList();

        //assert
        assertEquals(userList.size(), response.size());
        assertEquals(userList.get(0).getAge(), response.get(0).getAge());
        assertEquals(userList.get(1).getFirstName(), response.get(1).getFirstName());
        verify(userRepository, times(1)).findAll();
    }
}
