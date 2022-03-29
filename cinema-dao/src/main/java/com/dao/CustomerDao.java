package com.dao;

import com.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {
    int addUser(Customer customer);
    boolean delete(int id);
    List<Customer> all();
    Customer getCustomerById(int id);
    int updateCustomer(Customer customer);
    Customer login(@Param("username")String username,@Param("password")String password);
}
