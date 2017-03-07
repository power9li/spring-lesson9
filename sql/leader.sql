/*
Navicat MySQL Data Transfer

Source Server         :
Source Server Version : 50634
Source Host           : 119.28.18.237:3306
Source Database       : leaderus

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-02-27 16:04:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL DEFAULT '0',
  `cityName` varchar(20) NOT NULL,
  `provinceId` int(2) DEFAULT NULL COMMENT '省',
  `abbreviate` varchar(20) NOT NULL COMMENT '缩写',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for class2course 班级到课程
-- ----------------------------
DROP TABLE IF EXISTS `class2course`;
CREATE TABLE `class2course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classId` int(11) DEFAULT NULL COMMENT '班级ID',
  `courseId` int(11) DEFAULT NULL COMMENT '课程ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `state` int(11) DEFAULT NULL '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course 课程表
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseTitle` varchar(100) DEFAULT NULL COMMENT '课程名',
  `days` int(11) DEFAULT NULL '课程天数',
  `createTime` datetime DEFAULT NULL '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for LdClass 班级表
-- ----------------------------
DROP TABLE IF EXISTS `LdClass`;
CREATE TABLE `LdClass` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '评论',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for machineCode
-- ----------------------------
DROP TABLE IF EXISTS `machineCode`;
CREATE TABLE `machineCode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL COMMENT '用户ID',
  `name` varchar(100) DEFAULT NULL COMMENT '机器码名称',
  `nameSpell` varchar(100) DEFAULT NULL COMMENT '名称全拼',
  `code` varchar(255) DEFAULT NULL COMMENT '机器码',
  `qq` varchar(50) DEFAULT NULL COMMENT 'qq号码',
  `type` int(11) DEFAULT NULL COMMENT '枚举 0 Windows 1 mac 2 android',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=324 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for material 教材表
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `materialName` varchar(100) DEFAULT NULL COMMENT '教材名称',
  `videoName` varchar(200) DEFAULT NULL COMMENT '视频名称',
  `videoUrl` varchar(200) DEFAULT NULL COMMENT '视频网络地址',
  `taskUrl` varchar(300) DEFAULT NULL,
  `extra1` varchar(300) DEFAULT NULL,
  `extra2` varchar(300) DEFAULT NULL,
  `extra3` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for playCode 播放码表
-- ----------------------------
DROP TABLE IF EXISTS `playCode`;
CREATE TABLE `playCode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(50) DEFAULT NULL,
  `encryptionBatch` varchar(200) DEFAULT NULL,
  `machineCode` varchar(200) DEFAULT '' COMMENT '连接machineCode表code',
  `createTime` datetime DEFAULT NULL,
  `code` varchar(500) DEFAULT NULL COMMENT '播放码',
  `ValidityPeriod` int(5) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=457 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for province 省事字典表
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `provinceId` int(2) NOT NULL AUTO_INCREMENT,
  `provinceName` varchar(20) NOT NULL,
  `abbreviate` varchar(20) NOT NULL COMMENT '简称',
  PRIMARY KEY (`provinceId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for syllabus 教学大纲
-- ----------------------------
DROP TABLE IF EXISTS `syllabus`;
CREATE TABLE `syllabus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseId` int(11) DEFAULT NULL,
  `seq` int(11) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `materialId` int(11) DEFAULT NULL COMMENT '材料ID',
  `remark` varchar(255) DEFAULT NULL COMMENT '评论',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_permission  系统权限表
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) DEFAULT NULL COMMENT '排序号',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role 系统角色
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role_permission  角色权限对应表
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` varchar(36) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL COMMENT '角色id',
  `sys_permission_id` varchar(32) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `username` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_role 用户角色对应表
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(36) NOT NULL,
  `sys_user_id` varchar(32) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for test  测试用户表
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user  用户信息表
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qq` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(500) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `nameSpell` varchar(255) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `workYear` int(11) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `selfIntroduction` varchar(255) DEFAULT NULL,
  `weixin` varchar(100) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=203 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user2class  用户班级对应表
-- ----------------------------
DROP TABLE IF EXISTS `user2class`;
CREATE TABLE `user2class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `reasonType` tinyint(4) DEFAULT NULL,
  `season` int(11) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=utf8;
