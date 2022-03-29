package com.service.impl;

import com.service.RedisService;
import com.service.SmsService;
import com.service.exception.SmsCodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

@Service
public class SmsServiceImpl implements SmsService {
    public static final String VALIDATE_CODE_KEY = "code";
    @Autowired
    private RedisService redisService;

    @Override
    public String generateCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(getRandamDigit());
        }
        String code = stringBuilder.toString();
        redisService.setEx(VALIDATE_CODE_KEY,code,60);
        return code;
    }

    @Override
    public boolean checkCode(String code) {
        if(!StringUtils.hasLength(code)){
            return false;
        }
        Object cachedCode =  redisService.get(VALIDATE_CODE_KEY);
        if(cachedCode==null){
            throw new SmsCodeException(code, "当前code已经过期了");
        }
        return code.equalsIgnoreCase(cachedCode.toString());
    }

    private int getRandamDigit(){
        int[] digits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        int digit = random.nextInt(digits.length);//[0,9]
        return digit;
    }
}
