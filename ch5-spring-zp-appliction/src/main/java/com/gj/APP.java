package com.gj;

import com.gj.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ac.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.save();
    }
}
