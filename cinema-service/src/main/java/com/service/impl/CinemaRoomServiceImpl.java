package com.service.impl;

import com.dao.CinemaRoomDao;
import com.entity.CinemaRoom;
import com.service.CinemaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CinemaRoomServiceImpl implements CinemaRoomService {
    @Autowired
    private CinemaRoomDao dao;

    @Override
    public int addRoom(CinemaRoom room) {
        return dao.addRoom(room);
    }

    @Override
    public boolean delete(int id) {
        return dao.delete(id);
    }

    @Override
    public List<CinemaRoom> rooms() {
        return dao.rooms();
    }

    @Override
    public CinemaRoom room(int id) {
        return dao.room(id);
    }

    @Override
    public boolean updateRoom(CinemaRoom room) {
        return dao.updateRoom(room);
    }
}
