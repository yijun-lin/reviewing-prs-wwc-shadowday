package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testDoesUserExist_UserExists_ReturnsTrue() {
        UserService userService = new UserService(Arrays.asList("user1", "user2", "user3"));

        assertTrue(userService.doesUserExist("user2"));
    }

    @Test
    public void testDoesUserExist_UserNotExists_ReturnsFalse() {
        UserService userService = new UserService(Arrays.asList("user1", "user2", "user3"));

        assertFalse(userService.doesUserExist("user4"));
    }
}
