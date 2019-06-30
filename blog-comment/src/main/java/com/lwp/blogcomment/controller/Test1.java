package com.lwp.blogcomment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/25 17:14
 * @Description:
 */
@Controller
@RequestMapping("/test/test")
public class Test1 {

    @RequestMapping("/about")
    @ResponseBody
    public String test(){
        return "share";
    }
}
