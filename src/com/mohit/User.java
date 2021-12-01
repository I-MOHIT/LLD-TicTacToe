package com.mohit;

import java.util.UUID;

public class User {
    String userName;
    private String userId;

    public User(String userName) {
        this.userName = userName;
        this.userId = UUID.randomUUID().toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
