package com.service.impl;

import com.dao.AdministratorDao;
import com.entity.Administrator;
import com.service.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MIEaster
 * @date 2022/3/28 9:53
 */
@Service
public class AdminstratorServiceImpl implements AdministrationService {
@Autowired
private AdministratorDao dao;
    @Override
    public int addAdmin(Administrator administrator) {
        return dao.addAdmin(administrator);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<Administrator> getAllAdmin() {
        return dao.getAllAdmin();
    }

    @Override
    public boolean login(String username, String password) {
        return dao.login(username,password);
    }

    @Override
    public void update(Administrator administrator) {
            dao.update(administrator);
    }
}
