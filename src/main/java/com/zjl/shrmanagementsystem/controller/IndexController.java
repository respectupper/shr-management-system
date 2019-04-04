package com.zjl.shrmanagementsystem.controller;

import com.zjl.shrmanagementsystem.domain.User;
import com.zjl.shrmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/init.do")
    @ResponseBody
    public String init(Model model){
        User user = userService.selectByPrimaryKey(2);
        return "测试程序是否正常运行，运行结果:"+user.toString();
    }
}
