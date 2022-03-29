package com.service;

public interface SmsService {
    String generateCode();

    boolean checkCode(String code);
}