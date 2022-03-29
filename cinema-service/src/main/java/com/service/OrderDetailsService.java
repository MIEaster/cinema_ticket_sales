package com.service;

import com.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsService {

    OrderDetails getById(int id);
    boolean delete(int id);
    List<OrderDetails> all();
    int addOrder(OrderDetails orderDetails);
}
