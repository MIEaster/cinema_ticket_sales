package com.dao;

import com.entity.Type;

import java.util.List;

public interface TypeDao {
    List<Type> all();
    void addType(Type type);
}
