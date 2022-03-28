package com.service.impl;

import com.dao.SeatDao;
import com.entity.Seats;
import com.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatDao dao;

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public Seats getById(int id) {
        return dao.getById(id);
    }
}
