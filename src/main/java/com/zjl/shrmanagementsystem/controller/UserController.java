package com.zjl.shrmanagementsystem.controller;

import com.zjl.shrmanagementsystem.domain.User;
import com.zjl.shrmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login.do")
    public String login(String phone, String password,HttpSession session){
        User user = userService.login(phone,password);
        if (user!=null){
            session.setAttribute("userInfo",user);
            return "redirect:index.do";
        }
        return "login";
    }

    @RequestMapping("/register.do")
    public String register(String phone, String password, HttpSession session){
        User user = new User(phone,password);
        int line = userService.insertSelective(user);
        if (line>0){
            session.setAttribute("userInfo",user);
            return "redirect:index.do";
        }
        return "register";
    }

    @RequestMapping("/getVerificationCode.do")
    @ResponseBody
    public String getVerificationCode(String phone){
        /*success   成功状态
        repeat    手机号重复*/
        int result = userService.checkPhone(phone);
        if (result>0){
            return "{\"state\":\"repeat\",\"code\":\""+4396+"\"}";
        }
        return "{\"state\":\"success\",\"code\":\""+4396+"\"}";
    }
}
