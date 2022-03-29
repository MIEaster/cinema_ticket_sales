package com.service;

public interface RedisService {
    Object get(String key);

    void set(String key, Object value);
    void setEx(String key, Object value,int expire);
}
