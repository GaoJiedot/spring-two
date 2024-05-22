package com.gj.service.Impl;

import com.gj.dao.UserDao;
import com.gj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    UserDao userDao;
    @Override
    public void save() {
        userDao.save();
        System.out.println("执行了：UserService.save");
    }
}
