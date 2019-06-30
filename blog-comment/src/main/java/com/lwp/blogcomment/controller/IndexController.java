package com.lwp.blogcomment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: liuweipeng
 * @Date: 2018/9/6 10:56
 * @Description:
 */
@Controller
@RequestMapping()
public class IndexController {


    @RequestMapping()
    public String test(ModelMap map){
        map.addAttribute("test","jxh");
        return "index";
    }

}
