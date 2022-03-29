package com.service.exception;

public class SmsCodeException extends ServiceException{
    private String code ;



    public SmsCodeException(String code) {
        this.code = code;
    }

    public SmsCodeException(String message, String code) {
        super(message);
        this.code = code;
    }

    public SmsCodeException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
