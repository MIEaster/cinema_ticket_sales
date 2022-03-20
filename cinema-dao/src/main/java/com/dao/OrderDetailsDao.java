package com.dao;

import com.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsDao {
    OrderDetails getById(int id);
    boolean delete(int id);
    List<OrderDetails> all();
    int addOrder(OrderDetails orderDetails);
}
