package com.service;

import com.entity.Customer;

import java.util.List;

public interface CustomerService {
    int addUser(Customer customer);
    boolean delete(int id);
    List<Customer> all();
    Customer getCustomerById(int id);
    int updateCustomer(Customer customer);
}
