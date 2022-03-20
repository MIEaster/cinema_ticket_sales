package com.dao;

import com.entity.Actors;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActorDao {
    int addActor( Actors actor);
    void updateActor(Actors actors);
    void Delete(int id);
    Actors actor(int id);
    List<Actors> allActor ();
}
