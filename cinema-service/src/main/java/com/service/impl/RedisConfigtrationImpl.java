package com.service.impl;

import com.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisConfigtrationImpl implements RedisService {
    @Autowired
    private RedisTemplate template;
    @Override
    public void set(String key, Object values) {
        template.opsForValue().set(key,values);
    }

    @Override
    public Object get(String key) {
        return template.opsForValue().get(key);
    }

    @Override
    public void delete(String key) {
        template.delete(key);
    }
}
