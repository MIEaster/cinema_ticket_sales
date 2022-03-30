package com.dao;

import com.entity.Scheduling;

import java.util.List;

public interface SchedulingDao {
    Scheduling getById(int id);
    List<Scheduling> all();
    int update(Scheduling scheduling);
    int deletes(int id);
    Scheduling add(Scheduling scheduling);
}
