package com.lwp.blogcomment.model.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/25 18:11
 * @Description:
 */
@Table(name="admin")
@Entity
@Data
public class Admin {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name="password",length = 64)
    private String password;

    private String name;
}
