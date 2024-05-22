package com.gj.controller;

import com.gj.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserService userService;
    public void save(){
        System.out.println(" 执行了：UserControll.save");
    }
}
