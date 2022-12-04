-- 数据库
CREATE DATABASE IF NOT EXISTS linadmin DEFAULT CHARACTER SET utf8mb4;
-- 用户表
DROP TABLE IF EXISTS `lin_user`;
CREATE TABLE `lin_user`(
    `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `username` varchar(255) NOT NULL COMMENT '用户名',
    `password` varchar(255) NOT NULL COMMENT '密码',
    `nick_name` varchar(255) NOT NULL DEFAULT '默认昵称' COMMENT '昵称',
    `gender` varchar(2) NOT NULL COMMENT '性别',
    `phone` varchar(255) NOT NULL COMMENT '手机号',
    `email` varchar(255) NOT NULL COMMENT '邮箱',
    `avator` varchar(255) NOT NULL DEFAULT '' COMMENT '头像地址', 
    `status` tinyint(1) NOT NULL COMMENT '状态',
    `is_admin` tinyint(1) NOT NULL COMMENT '是否超级管理员' `create_time` datetime COMMENT '创建时间',
    `update_time` datetime COMMENT '修改时间',
    PRIMARY KEY(`user_id`)
) Engine = Innodb CHARACTER set utf8mb4 COMMENT = '用户表';
-- 角色表
DROP TABLE IF EXISTS `lin_role`;
CREATE TABLE `lin_role`(
    `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name` varchar(255) NOT NULL COMMENT '名称',
    `desc` varchar(255) NOT NULL COMMENT '描述',
    `status` tinyint(1) NOT NULL COMMENT '状态',
    `create_time` datetime COMMENT '创建时间',
    `update_time` datetime COMMENT '修改时间',
    PRIMARY KEY(`role_id`)
) Engine = Innodb CHARACTER set utf8mb4 COMMENT = '角色表';
-- 权限表
DROP TABLE IF EXISTS `lin_permissions`;
CREATE TABLE `lin_permissions`(
    `permissions_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `pid` int(11) NOT NULL COMMENT '父id',
    `title` varchar(255) NOT NULL COMMENT '名称',
    `perm` varchar(255) NOT NULL COMMENT '授权(menu:list,menu:edit)',
    `path` varchar(255) DEFAULT '' COMMENT '菜单URL',
    `type` int(11) NOT NULL COMMENT '权限类型(0 目录,1 菜单,2 按钮)',
    `status` tinyint(1) NOT NULL COMMENT '状态',
    `create_time` datetime COMMENT '创建时间',
    `update_time` datetime COMMENT '修改时间',
    PRIMARY KEY(`permissions_id`)
) Engine = Innodb CHARACTER set utf8mb4 COMMENT = '权限表';
-- 用户角色表
DROP TABLE IF EXISTS `lin_users_roles`;
CREATE TABLE `lin_users_roles`(
    `user_id` int(11) NOT NULL COMMENT '用户id',
    `role_id` int(11) NOT NULL COMMENT '角色id'
) Engine = Innodb CHARACTER set utf8mb4 COMMENT = '用户角色表';
-- 角色权限表
DROP TABLE IF EXISTS `lin_roles_permissions`;
CREATE TABLE `lin_roles_permissions`(
    `role_id` int(11) NOT NULL COMMENT '角色id',
    `permissions` int(11) NOT NULL COMMENT '权限id'
) Engine = Innodb CHARACTER set utf8mb4 COMMENT = '角色权限表';