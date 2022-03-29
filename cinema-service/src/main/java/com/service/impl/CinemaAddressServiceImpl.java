package com.service.impl;

import com.dao.CinemaAddressDao;
import com.entity.CinemaAddress;
import com.service.CinemaAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 9:57
 */
@Service
public class CinemaAddressServiceImpl implements CinemaAddressService {
    @Autowired
    private CinemaAddressDao dao;

    @Override
    public int add(CinemaAddress address) {
        return dao.add(address);
    }

    @Override
    public boolean delete(int id) {
        return dao.delete(id);
    }

    @Override
    public void update(CinemaAddress address) {
            dao.update(address);
    }

    @Override
    public List<CinemaAddress> allAdress() {
        return dao.allAdress();
    }

    @Override
    public CinemaAddress getById(int id) {
        return dao.getById(id);
    }
}
