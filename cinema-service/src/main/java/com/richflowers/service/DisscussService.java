package com.richflowers.service;

import com.entity.Discuss;

import java.util.List;

public interface DisscussService {
    List<Discuss> all();
    boolean delete(int id);
    int add(Discuss discuss);
}
