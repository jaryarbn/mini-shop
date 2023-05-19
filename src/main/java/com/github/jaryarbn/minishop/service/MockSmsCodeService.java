package com.github.jaryarbn.minishop.service;

import org.springframework.stereotype.Service;

@Service
public class MockSmsCodeService implements SmsCodeService{
    @Override
    public String sendSmsCode(String tel) {
        return "000000";
    }
}
