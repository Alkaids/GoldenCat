package org.alkaids.goldencat.model.entity;

import java.io.Serializable;

/**
 * Program Name: GoldenCat
 * <p>
 * Description: 消费记录
 * <p>
 * Created by Zhang.Haixin on 2018/6/10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class AccountItem implements Serializable {

    private String id;

    /**
     * 消费金额
     */
    private double accountMoney;

    /**
     * 消费类型
     */
    private String type;

    /**
     * 消费日期
     */
    private String dealDate;

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 消费备注
     */
    private String accountDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }
}
