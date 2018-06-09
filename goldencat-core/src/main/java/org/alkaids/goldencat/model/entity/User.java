package org.alkaids.goldencat.model.entity;

import java.io.Serializable;

/**
 * Program Name: GoldenCat
 * <p>
 * Description: 用户
 * <p>
 * Created by Zhang.Haixin on 2018/6/10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class User implements Serializable {

    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户等级
     */
    private Integer level;

    /**
     * 用户类型
     */
    private String userType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
