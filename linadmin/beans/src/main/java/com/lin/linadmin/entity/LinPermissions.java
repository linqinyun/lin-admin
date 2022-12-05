package com.lin.linadmin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "lin_permissions")
public class LinPermissions {
    /**
     * 主键id
     */
    @Id
    @Column(name = "permissions_id")
    private Integer permissionsId;

    /**
     * 父id
     */
    private Integer pid;

    /**
     * 名称
     */
    private String title;

    /**
     * 授权(menu:list,menu:edit)
     */
    private String perm;

    /**
     * 菜单URL
     */
    private String path;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序
     */
    @Column(name = "list_order")
    private Integer listOrder;

    /**
     * 权限类型(0 目录,1 菜单,2 按钮)
     */
    private Integer type;

    /**
     * 状态 0,1
     */
    private Boolean status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键id
     *
     * @return permissions_id - 主键id
     */
    public Integer getPermissionsId() {
        return permissionsId;
    }

    /**
     * 设置主键id
     *
     * @param permissionsId 主键id
     */
    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    /**
     * 获取父id
     *
     * @return pid - 父id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父id
     *
     * @param pid 父id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取名称
     *
     * @return title - 名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置名称
     *
     * @param title 名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取授权(menu:list,menu:edit)
     *
     * @return perm - 授权(menu:list,menu:edit)
     */
    public String getPerm() {
        return perm;
    }

    /**
     * 设置授权(menu:list,menu:edit)
     *
     * @param perm 授权(menu:list,menu:edit)
     */
    public void setPerm(String perm) {
        this.perm = perm;
    }

    /**
     * 获取菜单URL
     *
     * @return path - 菜单URL
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置菜单URL
     *
     * @param path 菜单URL
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取排序
     *
     * @return list_order - 排序
     */
    public Integer getListOrder() {
        return listOrder;
    }

    /**
     * 设置排序
     *
     * @param listOrder 排序
     */
    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    /**
     * 获取权限类型(0 目录,1 菜单,2 按钮)
     *
     * @return type - 权限类型(0 目录,1 菜单,2 按钮)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置权限类型(0 目录,1 菜单,2 按钮)
     *
     * @param type 权限类型(0 目录,1 菜单,2 按钮)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态 0,1
     *
     * @return status - 状态 0,1
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态 0,1
     *
     * @param status 状态 0,1
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}