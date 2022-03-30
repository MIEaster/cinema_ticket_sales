package com.service.impl;

import com.dao.SchedulingDao;
import com.entity.Scheduling;
import com.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
    public int update(Scheduling scheduling) {
      return  schedulingDao.update(scheduling);
    }

    @Override
    public int deletes(int id) {
        return schedulingDao.deletes(id);
    }

    @Override
    public Scheduling add(Scheduling scheduling) {
        return schedulingDao.add(scheduling);
    }
}
