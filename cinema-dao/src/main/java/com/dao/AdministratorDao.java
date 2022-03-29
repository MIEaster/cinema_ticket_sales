package com.dao;

import com.entity.Administrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorDao {
    int addAdmin(Administrator administrator);
    void delete(int id);
    List<Administrator> getAllAdmin();
    boolean login(@Param("username") String username, @Param("password") String password);
    void update(Administrator administrator);
}
