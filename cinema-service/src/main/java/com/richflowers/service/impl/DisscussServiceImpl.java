package com.richflowers.service.impl;

import com.dao.DiscussDao;
import com.entity.Discuss;
import com.richflowers.service.DisscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DisscussServiceImpl implements DisscussService {
    @Autowired
    private DiscussDao dao;

    @Override
    public List<Discuss> all() {
        return dao.all();
    }

    @Override
    public boolean delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int add(Discuss discuss) {
        return dao.add(discuss);
    }
}
