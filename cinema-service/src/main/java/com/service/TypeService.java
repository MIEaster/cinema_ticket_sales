package com.service;


import com.entity.Type;

import java.util.List;

public interface TypeService {
    List<Type> all();
    void addType(Type type);
}

