-- MySQL dump 10.13  Distrib 5.7.12, for osx10.11 (x86_64)
--
-- Host: localhost    Database: springlesson9
-- ------------------------------------------------------
-- Server version	5.7.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` int(11) NOT NULL DEFAULT '0',
  `cityName` varchar(20) NOT NULL,
  `provinceId` int(2) DEFAULT NULL COMMENT '省',
  `abbreviate` varchar(20) NOT NULL COMMENT '缩写',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class2course`
--

DROP TABLE IF EXISTS `class2course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class2course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classId` int(11) DEFAULT NULL COMMENT '班级ID',
  `courseId` int(11) DEFAULT NULL COMMENT '课程ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class2course`
--

LOCK TABLES `class2course` WRITE;
/*!40000 ALTER TABLE `class2course` DISABLE KEYS */;
INSERT INTO `class2course` VALUES (1,2,1,'2017-03-07 11:02:00',1);
/*!40000 ALTER TABLE `class2course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseTitle` varchar(100) DEFAULT NULL COMMENT '课程名',
  `days` int(11) DEFAULT NULL COMMENT '课程天数',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'黄埔一期',90,'2017-03-07 11:01:11');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ld_class`
--

DROP TABLE IF EXISTS `ld_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ld_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '评论',
  `monitor_name` varchar(40) DEFAULT NULL COMMENT '班长',
  `commissary_name` varchar(40) DEFAULT NULL COMMENT '学习委员',
  `curNormalStudents` int(11) DEFAULT '0' COMMENT '学员总数',
  `cur_arrearaged_students` int(11) DEFAULT '0' COMMENT '欠费总数',
  `droped_students` int(11) DEFAULT '0' COMMENT '退学总数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ld_class`
--

LOCK TABLES `ld_class` WRITE;
/*!40000 ALTER TABLE `ld_class` DISABLE KEYS */;
INSERT INTO `ld_class` VALUES (1,'全栈二期','2016-08-08 00:00:00','2017-01-28 00:00:00','NIO与多线程',NULL,NULL,0,0,0),(2,'全栈一期','0201-12-08 00:00:00','2017-04-28 00:00:00','spring与设计模式','许思涵','苏克强',0,0,0);
/*!40000 ALTER TABLE `ld_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ld_home_work`
--

DROP TABLE IF EXISTS `ld_home_work`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ld_home_work` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '作业id',
  `user_id` int(11) DEFAULT NULL COMMENT '学员id',
  `class_id` int(11) DEFAULT NULL COMMENT '班级id',
  `lession_id` int(11) DEFAULT NULL COMMENT '课程编号',
  `homework_file_path` varchar(255) DEFAULT NULL COMMENT '作业路径',
  `homework_file_name` varchar(200) DEFAULT NULL COMMENT '作业文件名',
  `create_date` timestamp NULL DEFAULT NULL COMMENT '上传时间',
  `start_count` int(11) DEFAULT '0' COMMENT '点赞数',
  `negative_count` int(11) DEFAULT '0' COMMENT '差评数',
  `correct_flag` bit(1) DEFAULT b'0' COMMENT '批改标志 0 未批改 1已批改',
  `best_flag` bit(1) DEFAULT b'0' COMMENT '是否优秀作业 1 是 0 不是',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_index` (`user_id`,`class_id`,`lession_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ld_home_work`
--

LOCK TABLES `ld_home_work` WRITE;
/*!40000 ALTER TABLE `ld_home_work` DISABLE KEYS */;
INSERT INTO `ld_home_work` VALUES (2,11,22,33,'/tmp/uploads/class_22/lesson_33/user_11/跟开涛学springMVC.pdf','跟开涛学springMVC.pdf','2017-02-25 15:54:42',0,0,'\0','\0'),(3,123,2323,141,'/tmp/uploads/class_2323/lesson_141/user_123/Q2016_03_02.pdf','Q2016_03_02.pdf','2017-02-25 16:12:08',0,0,'\0','\0'),(4,11,22,333,'/tmp/uploads/class_22/lesson_333/user_11/Q2016_03_02.pdf','test_new_name','2017-02-25 16:22:35',0,0,'\0','\0'),(8,11,221,333,'/tmp/uploads/class_221/lesson_333/user_11/Q2016_03_07_2.pdf','Q2016_03_07_2.pdf','2017-02-25 18:34:13',0,1,'\0','\0'),(13,11,222,333,'/tmp/uploads/class_222/lesson_333/user_11/Q2016_03_07_3.pdf','Q2016_03_07_3.pdf','2017-02-25 18:36:23',1,1,'\0','\0'),(14,66,66,66,'/tmp/uploads1/class_66/lesson_66/user_66/Q2016_03_12_2.pdf','Q2016_03_12_2.pdf','2017-02-25 18:44:33',4,0,'\0','\0'),(15,1,2,3,'/tmp/uploads/class_2/lesson_3/user_1/Q2016_03_12_2.pdf','Q2016_03_12_2.pdf','2017-03-03 09:08:44',9,1,'\0','\0'),(16,203,22,333,'/tmp/uploads/class_22/lesson_333/user_203/Q2016_03_12_2.pdf','Q2016_03_12_2.pdf','2017-03-06 04:01:41',1,0,'\0','\0'),(17,203,2,2,'/tmp/uploads/class_2/lesson_2/user_203/Q2016_03_12_2.pdf','Q2016_03_12_2.pdf','2017-03-07 02:13:54',0,0,'\0','\0'),(18,203,2,1,'/tmp/uploads/class_2/lesson_1/user_203/Q2016_03_12_1.pdf','Q2016_03_12_1.pdf','2017-03-07 03:37:06',0,0,'\0','\0');
/*!40000 ALTER TABLE `ld_home_work` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ld_home_work_fb`
--

DROP TABLE IF EXISTS `ld_home_work_fb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ld_home_work_fb` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `my_id` int(11) DEFAULT NULL COMMENT '批改的学员id',
  `user_id` int(11) DEFAULT NULL COMMENT '被批改的学员id',
  `homework_id` int(11) DEFAULT NULL COMMENT 'ld_home_work的id',
  `level_flag` varchar(1) DEFAULT NULL COMMENT '级别 A,B,C,D 之一 ',
  `mark` varchar(2048) DEFAULT NULL COMMENT '评语',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ld_home_work_fb`
--

LOCK TABLES `ld_home_work_fb` WRITE;
/*!40000 ALTER TABLE `ld_home_work_fb` DISABLE KEYS */;
INSERT INTO `ld_home_work_fb` VALUES (1,1,1,14,'A','hello,<b>world</b>!'),(4,1,66,14,'A','Hello <span style=\"background-color: rgb(255, 255, 0);\">Summerno</span>te'),(5,1,66,14,'A','<p>作业超赞！</p><p><b>向前辈学习了</b>！</p>'),(6,1,11,13,'B','这个学员也满认真的嘛，想法不错！'),(7,1,11,8,'D','这样也交了?太不负责了！'),(8,1,66,14,'A','<p>测试中文字体<b>测试中文字体</b>测试中文字体<u>测试中文字体</u></p><p>测试中文字体测试中文字体&lt;hr&gt;</p><p>测试中文字体</p><p>测试中文字体<span style=\"background-color: rgb(255, 0, 0);\">测试中文字体</span><span style=\"background-color: rgb(255, 255, 0);\">测试中文字体</span><span style=\"background-color: rgb(107, 165, 74);\">测试中文字体</span></p><ol><li>asdf</li><li>wsadf</li><li>asdfadsf</li><li>asfasfasf<br><u><br></u></li></ol>'),(9,1,11,13,'D','<p>列个表</p><table class=\"table table-bordered\"><tbody><tr><td>序号</td><td>说明</td><td>备注</td></tr><tr><td>1</td><td>作业要理解题意</td><td>不要盲目下手</td></tr></tbody></table><p><br></p>'),(10,203,1,15,'A','<p>very goold!</p>'),(11,203,1,15,'A','<p><span style=\"background-color: rgb(0, 255, 0);\">good!</span></p>'),(12,203,66,14,'A','<p>good,<span style=\"background-color: rgb(0, 0, 255);\">good</span>!</p>'),(13,203,66,14,'A','<p><b>GOOD! -_-!</b></p>'),(14,203,1,15,'B','<p><b>一些地方有错误，希望下次认证一些</b></p>'),(15,203,1,15,'C','给个差评！'),(16,203,1,15,'A','<p>向前辈学习!</p>'),(17,203,1,15,'B','<p>aabbcc<b>ded</b></p>'),(18,203,1,15,'B','<p>sdfasdf<b>asdfsadf</b>afs</p>'),(19,203,1,15,'A','<p>asdfasdfasdf===</p>'),(20,203,1,15,'C','adfasdfasdf'),(21,203,1,15,'B','<p>asdfasdf</p>'),(22,203,1,15,'D','<p>asgasdfasdfaf</p>'),(23,203,1,15,'B','<p>sadfasdfasdfasdf===asdfasdfasdf</p><p>;lija;lskdfj</p>'),(24,203,203,16,'A','<p>非常不错</p>');
/*!40000 ALTER TABLE `ld_home_work_fb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `machineCode`
--

DROP TABLE IF EXISTS `machineCode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `machineCode`
--

LOCK TABLES `machineCode` WRITE;
/*!40000 ALTER TABLE `machineCode` DISABLE KEYS */;
/*!40000 ALTER TABLE `machineCode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playCode`
--

DROP TABLE IF EXISTS `playCode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playCode`
--

LOCK TABLES `playCode` WRITE;
/*!40000 ALTER TABLE `playCode` DISABLE KEYS */;
/*!40000 ALTER TABLE `playCode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `province`
--

DROP TABLE IF EXISTS `province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `province` (
  `provinceId` int(2) NOT NULL AUTO_INCREMENT,
  `provinceName` varchar(20) NOT NULL,
  `abbreviate` varchar(20) NOT NULL COMMENT '简称',
  PRIMARY KEY (`provinceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `province`
--

LOCK TABLES `province` WRITE;
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
/*!40000 ALTER TABLE `province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syllabus`
--

DROP TABLE IF EXISTS `syllabus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syllabus`
--

LOCK TABLES `syllabus` WRITE;
/*!40000 ALTER TABLE `syllabus` DISABLE KEYS */;
/*!40000 ALTER TABLE `syllabus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_permission`
--

DROP TABLE IF EXISTS `sys_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_permission`
--

LOCK TABLES `sys_permission` WRITE;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES ('1','Student','1'),('2','Teacher','1');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_permission`
--

DROP TABLE IF EXISTS `sys_role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role_permission` (
  `id` varchar(36) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL COMMENT '角色id',
  `sys_permission_id` varchar(32) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_permission`
--

LOCK TABLES `sys_role_permission` WRITE;
/*!40000 ALTER TABLE `sys_role_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `username` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES ('1','power','shenli','123456','123456','0','Student');
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS `sys_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_role` (
  `id` varchar(36) NOT NULL,
  `sys_user_id` varchar(32) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
INSERT INTO `sys_user_role` VALUES ('1','1','1');
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (203,NULL,'123456',NULL,'power','','xxx@yyy.com',1,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-03-05 02:09:52',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user2class`
--

DROP TABLE IF EXISTS `user2class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user2class`
--

LOCK TABLES `user2class` WRITE;
/*!40000 ALTER TABLE `user2class` DISABLE KEYS */;
INSERT INTO `user2class` VALUES (1,203,2,'2017-03-06 15:59:44',NULL,NULL,NULL,NULL),(2,1,2,'2017-03-06 15:19:25',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user2class` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-07 11:37:29
