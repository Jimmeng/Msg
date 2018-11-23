package com.sjm.msg.service;

import com.sjm.msg.dao.UserDao;
import com.sjm.msg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUser(){
        return userDao.selectAll();
    }
}
