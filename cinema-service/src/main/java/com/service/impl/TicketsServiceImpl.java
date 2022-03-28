package com.service.impl;

import com.dao.TicketsDao;
import com.entity.Tickets;
import com.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketsServiceImpl implements TicketsService {
    @Autowired
    private TicketsDao dao;
    @Override
    public int addTicket(Tickets ticketRefund) {
        return dao.addTicket(ticketRefund);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<Tickets> all() {
        return dao.all();
    }
}
