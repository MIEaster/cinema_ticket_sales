package com.dao;

import com.entity.CinemaAddress;

import java.util.List;

public interface CinemaAddressDao {
    int add(CinemaAddress address);
    boolean delete(int id);
    void update(CinemaAddress address);
    List<CinemaAddress> allAdress();
    CinemaAddress getById(int id);


}
