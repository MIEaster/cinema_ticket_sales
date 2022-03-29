package com.service.impl;

import com.dao.SchedulingDao;
import com.entity.Scheduling;
import com.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchedulingServiceImpl implements SchedulingService {

    @Autowired
    private SchedulingDao schedulingDao;

    @Override
    public Scheduling getById(int id) {
        return schedulingDao.getById(id);
    }

    @Override
    public List<Scheduling> all() {
        return schedulingDao.all();
    }

    @Override
    public void update(Scheduling scheduling) {
        schedulingDao.update(scheduling);
    }
}
