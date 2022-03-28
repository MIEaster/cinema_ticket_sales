package com.service;

import com.entity.CinemaAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 9:56
 */

public interface CinemaAddressService {
    int add(CinemaAddress address);
    boolean delete(int id);
    void update(CinemaAddress address);
    List<CinemaAddress> allAdress();
    CinemaAddress getById(int id);
}
