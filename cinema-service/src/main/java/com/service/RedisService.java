package com.service;

public interface RedisService {
    void  set(String key,Object values);
    Object get(String key);
     void delete(String key);
}
