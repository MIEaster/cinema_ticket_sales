package com.service.impl;

import com.dao.ActorDao;
import com.entity.Actors;
import com.service.ActorService;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 10:02
 */
public class ActorServiceImpl implements ActorService {
    private ActorDao dao;
    @Override
    public int addActor(Actors actor) {
        return dao.addActor(actor);
    }

    @Override
    public void updateActor(Actors actors) {
        dao.updateActor(actors);
    }

    @Override
    public void Delete(int id) {
        dao.Delete(id);
    }

    @Override
    public Actors actor(int id) {
        return dao.actor(id);
    }

    @Override
    public List<Actors> allActor() {
        return dao.allActor();
    }
}
