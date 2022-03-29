package com.service;

import com.entity.Scheduling;

import java.util.List;

public interface SchedulingService {

    Scheduling getById(int id);
    List<Scheduling> all();
    void update(Scheduling scheduling);
}
