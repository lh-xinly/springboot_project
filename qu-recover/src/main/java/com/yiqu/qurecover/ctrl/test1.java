package com.yiqu.qurecover.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test1 {

    @RequestMapping("index.html")
    public String hello(ModelMap modelMap){

        return "index";
    }
}
