package com.lin.linadmin.entity;

import javax.persistence.*;

@Table(name = "lin_roles_permissions")
public class LinRolesPermissions {
    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer permissions;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限id
     *
     * @return permissions - 权限id
     */
    public Integer getPermissions() {
        return permissions;
    }

    /**
     * 设置权限id
     *
     * @param permissions 权限id
     */
    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }
}