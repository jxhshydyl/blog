package com.lwp.blogcomment.controller;

import com.lwp.blogcomment.model.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuweipeng
 * @Date: 27/9/2019 下午 5:00
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping()
public class LoginController {
    @RequestMapping("toLogin")
    public String toLogin(User user, Model model) {
        //shiro用户认证
        //获取subject
        Subject subject = SecurityUtils.getSubject();
        //封装用户数据
        UsernamePasswordToken userToken = new UsernamePasswordToken(user.getName(), user.getPassword());
        //执行登录方法,用捕捉异常去判断是否登录成功
        try {
            subject.login(userToken);
            return "redirect:/what.do";
        } catch (UnknownAccountException e) {
            //用户名不存在
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } catch (IncorrectCredentialsException e) {
            //密码错误
            model.addAttribute("msg", "密码错误");
            return "login";
        }

    }

}
