package com.katthew.service.impl;

import com.katthew.dao.UserDao;
import com.katthew.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    };

    public void save(){
        userDao.save();
    }
}
