package com.dao;

import com.entity.Seats;

public interface SeatDao {
    void delete(int id);
    Seats getById(int id);
}
