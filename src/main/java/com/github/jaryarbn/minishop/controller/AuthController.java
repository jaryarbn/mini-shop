package com.github.jaryarbn.minishop.controller;

import com.github.jaryarbn.minishop.generate.User;
import com.github.jaryarbn.minishop.service.AuthService;
import com.github.jaryarbn.minishop.service.TelVerificationService;
import com.github.jaryarbn.minishop.service.UserContext;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class AuthController {
    private final AuthService authService;
    private final TelVerificationService telVerificationService;

    @Autowired
    public AuthController(AuthService authService, TelVerificationService telVerificationService) {
        this.authService = authService;
        this.telVerificationService = telVerificationService;
    }


    @PostMapping("/code")
    public void code(@RequestBody TelAndCode telAndCode, HttpServletResponse response) {
        if (telVerificationService.verifyTelParameter(telAndCode)) {
            authService.sendVerificationCode(telAndCode.getTel());
        } else {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
        }

    }

    @PostMapping("/login")
    public void login(@RequestBody TelAndCode telAndCode) {
        UsernamePasswordToken token = new UsernamePasswordToken(telAndCode.getTel(), telAndCode.getCode());
        token.setRememberMe(true);

        SecurityUtils.getSubject().login(token);
    }

    public static class LoginResponse {
        private boolean login;
        private User user;

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

    @PostMapping("/status")
    public LoginResponse loginStatus() {
        if (UserContext.getCurrentUser() == null) {
            return LoginResponse.notLogin();
        } else {
            return LoginResponse.login(UserContext.getCurrentUser());
        }
    }

    public static class TelAndCode {

        public TelAndCode(String tel, String code) {
            this.tel = tel;
            this.code = code;
        }

        private String tel;
        private String code;

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
