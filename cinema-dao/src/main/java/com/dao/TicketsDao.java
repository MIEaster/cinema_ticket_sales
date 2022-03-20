package com.dao;

import com.entity.Tickets;

import java.util.List;

public interface TicketsDao {
    int addTicket(Tickets ticketRefund );
    void delete(int id);
    List<Tickets> all();
}
