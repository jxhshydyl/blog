package com.lwp.blogcomment.service.impl;


import com.lwp.blogcomment.model.domain.User;
import com.lwp.blogcomment.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Queue;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/26 10:02
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {
    private Queue<Map<String,Object>> queue;

    @Override
    public User findUserById(String userId) {
        return new User();
    }
}
