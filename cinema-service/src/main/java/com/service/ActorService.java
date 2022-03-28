package com.service;

import com.entity.Actors;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 10:01
 */
public interface ActorService {
    int addActor( Actors actor);
    void updateActor(Actors actors);
    void Delete(int id);
    Actors actor(int id);
    List<Actors> allActor ();
}
