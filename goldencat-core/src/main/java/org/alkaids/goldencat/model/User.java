package org.alkaids.goldencat.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class User {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 用户等级
     */
    @Column(name = "user_level")
    private String userLevel;

    /**
     * 用户头像地址
     */
    @Column(name = "user_icon")
    private String userIcon;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户权限
     */
    private String authority;
}