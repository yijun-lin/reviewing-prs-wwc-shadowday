package com.example;

import java.util.List;

public class UserService {
    private List<String> users;

    // Constructor injection
    public UserService(List<String> users) {
        this.users = users;
    }

    // Rest of the code...

    public boolean isUserExists(String userName) {
        boolean f = false;

        for (int index = 0; index < users.size(); index++) {
            String user = users.get(index);

            if (userName.equals(user)) {
                f = true;
                break;
            }
        }

        return f;
    }
}
