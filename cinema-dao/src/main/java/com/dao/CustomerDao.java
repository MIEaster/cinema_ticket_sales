package com.dao;

import com.entity.Customer;

import java.util.List;

public interface CustomerDao {
    int addUser(Customer customer);
    boolean delete(int id);
    List<Customer> all();
    Customer getCustomerById(int id);
    int updateCustomer(Customer customer);
    Customer getEmail(String customerEmail);
}
