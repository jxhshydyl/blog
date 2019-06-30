package com.lwp.blogui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/5 10:21
 * @Description:
 */
@RequestMapping("/user")
@RestController
public class TestController {

    @RequestMapping("/who")
    public String who() {
        return "my name is liangwang";
    }
}
