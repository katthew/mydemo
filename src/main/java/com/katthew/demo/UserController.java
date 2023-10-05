package com.katthew.demo;

import com.katthew.service.UserService;
import com.katthew.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)app.getBean("userService" );
        userService.save();

    }
}