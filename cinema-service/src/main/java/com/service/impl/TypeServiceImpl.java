package com.service.impl;

import com.dao.TypeDao;
import com.entity.Type;
import com.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao dao;

    @Override
    public List<Type> all() {
        return dao.all();
    }

    @Override
    public void addType(Type type) {
        dao.addType(type);
    }
}
