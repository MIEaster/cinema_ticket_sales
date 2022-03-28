package com.service;

import com.entity.Administrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 9:52
 */
public interface AdministrationService {
    int addAdmin(Administrator administrator);
    void delete(int id);
    List<Administrator> getAllAdmin();
    boolean login(@Param("username") String username, @Param("password") String password);
    void update(Administrator administrator);
}
