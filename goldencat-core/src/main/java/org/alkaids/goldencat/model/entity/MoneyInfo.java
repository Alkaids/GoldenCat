package org.alkaids.goldencat.model.entity;

import java.io.Serializable;

/**
 * Program Name: GoldenCat
 * <p>
 * Description: 预算
 * <p>
 * Created by Zhang.Haixin on 2018/6/10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class MoneyInfo implements Serializable {

    /**
     * 预算金额
     */
    private double count;

    /**
     * 剩余金额
     */
    private double balance;

    /**
     * 消费金额
     */
    private double cost;

    /**
     * 比例
     */
    private double percentage;

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = this.count - this.cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage() {
        this.percentage = this.cost / this.count;
    }
}
