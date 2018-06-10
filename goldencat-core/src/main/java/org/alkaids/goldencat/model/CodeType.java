package org.alkaids.goldencat.model;

import javax.persistence.*;

@Table(name = "code_type")
public class CodeType {
    /**
     * 字典item_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 字典主表Id
     */
    @Column(name = "p_id")
    private String pId;

    /**
     * 类型名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 类型图标路径
     */
    @Column(name = "item_icon")
    private String itemIcon;

    /**
     * 获取字典item_id
     *
     * @return id - 字典item_id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字典item_id
     *
     * @param id 字典item_id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取字典主表Id
     *
     * @return p_id - 字典主表Id
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置字典主表Id
     *
     * @param pId 字典主表Id
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * 获取类型名称
     *
     * @return item_name - 类型名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置类型名称
     *
     * @param itemName 类型名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取类型图标路径
     *
     * @return item_icon - 类型图标路径
     */
    public String getItemIcon() {
        return itemIcon;
    }

    /**
     * 设置类型图标路径
     *
     * @param itemIcon 类型图标路径
     */
    public void setItemIcon(String itemIcon) {
        this.itemIcon = itemIcon;
    }
}