package org.alkaids.goldencat.model;

import javax.persistence.*;

public class Code {
    /**
     * 字典id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 字典名称
     */
    @Column(name = "code_name")
    private String codeName;

    /**
     * 备注
     */
    private String memo;

    /**
     * 获取字典id
     *
     * @return id - 字典id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字典id
     *
     * @param id 字典id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取字典名称
     *
     * @return code_name - 字典名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设置字典名称
     *
     * @param codeName 字典名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}