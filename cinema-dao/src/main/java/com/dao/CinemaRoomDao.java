package com.dao;

import com.entity.CinemaRoom;

import java.util.List;

public interface CinemaRoomDao {
    int addRoom(CinemaRoom room);
    boolean delete(int id);
    List<CinemaRoom> rooms();
    CinemaRoom room(int id);
    boolean updateRoom(CinemaRoom room);
}
