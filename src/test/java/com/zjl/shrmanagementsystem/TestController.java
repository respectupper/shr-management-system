package com.zjl.shrmanagementsystem;

import com.zjl.shrmanagementsystem.domain.*;
import com.zjl.shrmanagementsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IUserTrainService userTrainService;

    @Autowired
    private IRewardsAndPenaltiesService rewardsAndPenaltiesService;

    @Autowired
    private ICheckWorkAttendanceInfoService checkWorkAttendanceInfoService;

    @RequestMapping("/init.do")
    @ResponseBody
    public String init(Model model){
        User user = userService.selectByPrimaryKey(1);
        return "测试程序是否正常运行，运行结果:"+user.toString();
    }
}
