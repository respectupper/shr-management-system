package com.zjl.shrmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public String init(){
        return "index";
    }

    @RequestMapping("/initRegister.do")
    public String initRegister(){
        return "register";
    }

    @RequestMapping("/initLogin.do")
    public String initLogin(){
        return "login";
    }
}
