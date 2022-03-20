package com.dao;

import com.entity.Discuss;

import java.util.List;

public interface DiscussDao {
    List<Discuss > all();
    boolean delete(int id);
    int add(Discuss discuss);
}
