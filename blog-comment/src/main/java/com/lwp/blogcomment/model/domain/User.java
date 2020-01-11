package com.lwp.blogcomment.model.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/25 17:16
 * @Description:
 */
@Data
@ToString
public class User {
    private Long id;
    private String password;
    private String name;
}
