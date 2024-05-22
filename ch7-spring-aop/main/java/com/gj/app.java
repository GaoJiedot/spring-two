package com.gj;


import com.gj.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
        UserDao userDao=ac.getBean("userDao",UserDao.class);
        userDao.insert();
        System.out.println();
        userDao.delete();
        System.out.println();
    }
}
