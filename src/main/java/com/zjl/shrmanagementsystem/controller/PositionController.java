package com.zjl.shrmanagementsystem.controller;

import com.zjl.shrmanagementsystem.domain.Position;
import com.zjl.shrmanagementsystem.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @RequestMapping("/getPositionAll.do")
    @ResponseBody
    public String getPositionAll(int id){
        List<Position> list = positionService.queryPositionByDepartmentId(id);
        String json = "{}";
        json = "[";
        for (int i = 0;i<list.size();i++){
            if (i==list.size()-1){
                json += "{\"id\":\""+list.get(i).getPositionId()+"\",\"name\":\""+list.get(i).getPositionName()+"\"}";
                break;
            }
            json += "{\"id\":\""+list.get(i).getPositionId()+"\",\"name\":\""+list.get(i).getPositionName()+"\"},";
        }
        json += "]";
        return json;
    }
}
