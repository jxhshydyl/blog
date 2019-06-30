package com.lwp.blogcomment.thread;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/26 09:45
 * @Description:
 */
public class TestThread implements Runnable{
    @Autowired

    @Override
    public void run() {
        System.out.println(1);
    }
}
