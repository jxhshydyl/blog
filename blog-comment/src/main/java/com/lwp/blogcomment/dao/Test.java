package com.lwp.blogcomment.dao;

import com.lwp.comment.blogcomment.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/25 17:14
 * @Description:
 */
@Mapper
public interface Test{
    List<User> queryUser();
}
