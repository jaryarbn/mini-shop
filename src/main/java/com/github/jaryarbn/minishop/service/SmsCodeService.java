package com.github.jaryarbn.minishop.service;

public interface SmsCodeService {
    /**
     * 向一个指定的手机号发验证码，返回正确答案
     * @param tel 目标手机号
     * @return 正确答案
     */
    String sendSmsCode(String tel);
}
