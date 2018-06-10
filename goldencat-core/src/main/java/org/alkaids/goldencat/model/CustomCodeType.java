package org.alkaids.goldencat.model;

import javax.persistence.*;

@Table(name = "custom_code_type")
public class CustomCodeType {
    /**
     * 用户自定义分类code_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * code表id（用户自定义添加的分类ID关联）
     */
    @Column(name = "p_id")
    private String pId;

    /**
     * 自定义分类名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 自定义分类图标路径
     */
    @Column(name = "item_icon")
    private String itemIcon;

    /**
     * 获取用户自定义分类code_id
     *
     * @return id - 用户自定义分类code_id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置用户自定义分类code_id
     *
     * @param id 用户自定义分类code_id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取code表id（用户自定义添加的分类ID关联）
     *
     * @return p_id - code表id（用户自定义添加的分类ID关联）
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置code表id（用户自定义添加的分类ID关联）
     *
     * @param pId code表id（用户自定义添加的分类ID关联）
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * 获取自定义分类名称
     *
     * @return item_name - 自定义分类名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置自定义分类名称
     *
     * @param itemName 自定义分类名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取自定义分类图标路径
     *
     * @return item_icon - 自定义分类图标路径
     */
    public String getItemIcon() {
        return itemIcon;
    }

    /**
     * 设置自定义分类图标路径
     *
     * @param itemIcon 自定义分类图标路径
     */
    public void setItemIcon(String itemIcon) {
        this.itemIcon = itemIcon;
    }
}