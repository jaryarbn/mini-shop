package com.github.jaryarbn.minishop.service;

import com.github.jaryarbn.minishop.controller.AuthController;

import java.util.regex.Pattern;

public class TelVerificationService {
    private static Pattern TEL_PATTERN = Pattern.compile("1\\d{10}");

    public boolean verifyTelParameter(AuthController.TelAndCode param) {
        if (param == null) {
            return false;
        } else if (param.getTel() == null) {
            return false;
        } else {
            return TEL_PATTERN.matcher(param.getTel()).find();
        }
    }
}
