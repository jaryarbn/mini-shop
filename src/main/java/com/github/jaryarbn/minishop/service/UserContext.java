package com.github.jaryarbn.minishop.service;

import com.github.jaryarbn.minishop.generate.User;

public class UserContext {
    private static ThreadLocal<User> currentUser = new ThreadLocal<>();

    public static User getCurrentUser() {
        return currentUser.get();
    }

    public static void setCurrentUser(User user) {
        currentUser.set(user);
    }
}
