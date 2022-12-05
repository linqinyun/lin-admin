package com.lin.linadmin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "lin_user")
public class LinUser {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像地址
     */
    private String avator;

    /**
     * 状态 0,1
     */
    private Boolean status;

    /**
     * 是否超级管理员 0,1
     */
    @Column(name = "is_admin")
    private Boolean isAdmin;

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
     * @return user_id - 主键id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键id
     *
     * @param userId 主键id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取头像地址
     *
     * @return avator - 头像地址
     */
    public String getAvator() {
        return avator;
    }

    /**
     * 设置头像地址
     *
     * @param avator 头像地址
     */
    public void setAvator(String avator) {
        this.avator = avator;
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
     * 获取是否超级管理员 0,1
     *
     * @return is_admin - 是否超级管理员 0,1
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置是否超级管理员 0,1
     *
     * @param isAdmin 是否超级管理员 0,1
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
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