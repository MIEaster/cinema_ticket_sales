package com.service;

import com.entity.Tickets;

import java.util.List;

public interface TicketsService {

    int addTicket(Tickets ticketRefund );
    void delete(int id);
    List<Tickets> all();
}
