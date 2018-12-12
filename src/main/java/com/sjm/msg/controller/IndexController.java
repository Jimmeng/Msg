package com.sjm.msg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/login")
    public String index(){
        return "get it!";
    }
}
