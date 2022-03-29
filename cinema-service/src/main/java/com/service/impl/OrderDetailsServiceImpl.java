package com.service.impl;

import com.dao.OrderDetailsDao;
import com.entity.OrderDetails;
import com.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsDao orderDetailsDao;

    @Override
    public OrderDetails getById(int id) {
        return orderDetailsDao.getById(id);
    }

    @Override
    public boolean delete(int id) {
        return orderDetailsDao.delete(id);
    }

    @Override
    public List<OrderDetails> all() {
        return orderDetailsDao.all();
    }

    @Override
    public int addOrder(OrderDetails orderDetails) {
        return orderDetailsDao.addOrder(orderDetails);
    }
}
