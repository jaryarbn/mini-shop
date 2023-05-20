package com.github.jaryarbn.minishop.service;

import com.github.jaryarbn.minishop.controller.AuthController;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;
@Service
public class TelVerificationService {
    private static final Pattern TEL_PATTERN = Pattern.compile("1\\d{10}");

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
