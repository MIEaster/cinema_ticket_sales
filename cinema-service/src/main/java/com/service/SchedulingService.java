package com.service;

import com.entity.Scheduling;

import java.util.List;

public interface SchedulingService {

    Scheduling getById(int id);
    List<Scheduling> all();
    int update(Scheduling scheduling);
    int deletes(int id);
    Scheduling add(Scheduling scheduling);
}
