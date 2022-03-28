package com.service;

import com.entity.CinemaRoom;

import java.util.List;

public interface CinemaRoomService {
    int addRoom(CinemaRoom room);
    boolean delete(int id);
    List<CinemaRoom> rooms();
    CinemaRoom room(int id);
    boolean updateRoom(CinemaRoom room);

}
