package org.alkaids.goldencat.model;

import javax.persistence.*;

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
     * 获取用户id
     *
     * @return id - 用户id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户等级
     *
     * @return user_level - 用户等级
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级
     *
     * @param userLevel 用户等级
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取用户头像地址
     *
     * @return user_icon - 用户头像地址
     */
    public String getUserIcon() {
        return userIcon;
    }

    /**
     * 设置用户头像地址
     *
     * @param userIcon 用户头像地址
     */
    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}