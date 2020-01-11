package com.lwp.blogcomment.config;

import com.lwp.blogcomment.model.domain.User;
import com.lwp.blogcomment.service.TestService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    private TestService TestService;

    /**
     * 执行授权
     * @param arg0
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        // TODO Auto-generated method stub
        System.out.println("授权");
        //获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        //给资源授权
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addStringPermission(user.getPerms());
        return simpleAuthorizationInfo;
    }

    /**
     * 执行认证逻辑
     * @param arg0
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        // TODO Auto-generated method stub
        System.out.println("认证");

        //shiro判断逻辑
        UsernamePasswordToken user = (UsernamePasswordToken) arg0;
        User realUser = new User();
        realUser.setName(user.getUsername());
        realUser.setPassword(String.copyValueOf(user.getPassword()));
        User newUser = null;//TestService.findUser(realUser);
        //System.out.println(user.getUsername());
        if (newUser == null) {
            //用户名错误
            //shiro会抛出UnknownAccountException异常
            return null;
        }
        return new SimpleAuthenticationInfo(newUser, newUser.getPassword(), "");
    }
}