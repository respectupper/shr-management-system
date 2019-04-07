package com.zjl.shrmanagementsystem.controller;

import com.zjl.shrmanagementsystem.domain.Department;
import com.zjl.shrmanagementsystem.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/getDepartmentAll.do")
    @ResponseBody
    public String getDepartmentAll(){
        List<Department> list = departmentService.queryAll();
        String json = "{}";
        json = "[";
        for (int i = 0;i<list.size();i++){
            if (i==list.size()-1){
                json += "{\"id\":\""+list.get(i).getDepartmentId()+"\",\"name\":\""+list.get(i).getDepartmentName()+"\"}";
                break;
            }
            json += "{\"id\":\""+list.get(i).getDepartmentId()+"\",\"name\":\""+list.get(i).getDepartmentName()+"\"},";
        }
        json += "]";
        return json;
    }
}
