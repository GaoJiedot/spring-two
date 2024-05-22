package com.gj.service.Impl;

import com.gj.Impl.User1DaoImpl;
import com.gj.beans.User1;
import com.gj.dao.User1Dao;
import com.gj.service.UserService;

public class UserServiceImpl implements UserService {
    User1Dao user1Daod;


    public UserServiceImpl(User1Dao user1Dao) {
        this.user1Daod = user1Dao;
    }

    @Override
    public boolean login(String name, String password) {
        return user1Daod.login(name,password);
    }

    public void setDao(User1Dao user1Daod) {
        this.user1Daod =user1Daod;
    }

}
