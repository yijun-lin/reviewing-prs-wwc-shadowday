package com.example;

import java.util.List;

public class UserService {
    private List<String> userList;

    // Constructor injection
    public UserService(List<String> userList) {
        this.userList = userList;
    }

    // Rest of the code...

    public boolean doesUserExist(String userName) {
        boolean doesExist = false;

        for (int index = 0; index < userList.size(); index++) {
            String user = userList.get(index);

            if (userName.equals(user)) {
                doesExist = true;
                break;
            }
        }

        return doesExist;
    }
}
