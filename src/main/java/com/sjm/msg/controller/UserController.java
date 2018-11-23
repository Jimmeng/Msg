package com.sjm.msg.controller;

import com.sjm.msg.entity.User;
import com.sjm.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get", produces = {"application/json;charset=UTF-8"})
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
