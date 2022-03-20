package com.dao;

import com.entity.Scheduling;

import java.util.List;

public interface SchedulingDao {
    Scheduling getById(int id);
    List<Scheduling> all();
    void update(Scheduling scheduling);

}
