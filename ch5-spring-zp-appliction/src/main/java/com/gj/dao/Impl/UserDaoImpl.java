package com.gj.dao.Impl;

import com.gj.dao.UserDao;
import com.gj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private User user;

    @Autowired
    public UserDaoImpl(User user) {
        this.user = user;
    }
    @Override
    public void save() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ac.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
        System.out.println("执行了：UserDaoImpl。save");
    }
}

