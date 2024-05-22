package com.gj.Impl;

import com.gj.dao.User1Dao;

public class User1DaoImpl implements User1Dao {

        @Override
        public boolean login (String name, String password){
            if ("gj".equals(name) && "1234".equals(password)) {
                return true;
            }
            return false;
        }
    }
