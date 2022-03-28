package com.richflowers.service.impl;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.richflowers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao dao;
    @Override
    public int addUser(Customer customer) {
        return dao.addUser(customer);
    }

    @Override
    public boolean delete(int id) {
        return dao.delete(id);
    }

    @Override
    public List<Customer> all() {
        return dao.all();
    }

    @Override
    public Customer getCustomerById(int id) {
        return dao.getCustomerById(id);
    }

    @Override
    public int updateCustomer(Customer customer) {
       return dao.updateCustomer(customer);
    }
}
