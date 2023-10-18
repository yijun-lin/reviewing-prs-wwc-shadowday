package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    class UserStub implements User {
        public String getUsername() {
            return "testUser";
        }
        public String getPassword() {
            return "testPassword";
        }
        public String getName() {
            // Stub method
            return null;
        }
        public String getAddress() {
            // Stub method
            return null;
        }
        public String getPhone() {
            // Stub method
            return null;
        }
    }

    @Test
    public void testUserLogin() {
        User user = new UserStub();
        UserLoginService service = new UserLoginService();
        try {
            service.login(user);
        } catch (Exception e) {
            fail("No exceptions expected but found: " + e);
        }
        assertEquals("testUser", user.getUsername());
        assertEquals("testPassword", user.getPassword());
    }
}
