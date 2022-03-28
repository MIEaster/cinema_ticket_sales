package com.service;

import com.entity.Seats;

public interface SeatService {
    void delete(int id);
    Seats getById(int id);
}
