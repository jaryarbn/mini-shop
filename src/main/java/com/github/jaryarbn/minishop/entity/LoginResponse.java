package com.github.jaryarbn.minishop.entity;

import com.github.jaryarbn.minishop.generate.User;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class LoginResponse {
    private boolean login;
    private User user;

    public LoginResponse() {
    }

    public static LoginResponse notLogin() {
        return new LoginResponse(false, null);
    }

    public static LoginResponse login(User user) {
        return new LoginResponse(true, user);
    }

    private LoginResponse(boolean login, User user) {
        this.login = login;
        this.user = user;
    }

    public boolean isLogin() {
        return login;
    }

    @SuppressFBWarnings("EI_EXPOSE_REP")
    public User getUser() {
        return user;
    }
}
