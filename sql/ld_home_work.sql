-- 创建多键唯一索引
-- CREATE UNIQUE INDEX unique_index ON ld_home_work (user_id,class_id,lession_id) USING BTREE;

-- 删除索引
-- ALTER TABLE ld_home_work DROP INDEX unique_index;

-- 例子: 不冲突时创建,冲突时更新
-- insert into ld_home_work(user_id,class_id,lession_id,homework_file_name) values(11,221,333,'test_new_name1') ON DUPLICATE KEY UPDATE homework_file_name='test_new_name1';



DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qq` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(500) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `nameSpell` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



  -- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseTitle` varchar(100) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


- ----------------------------
-- Table structure for `ldclass`
-- ----------------------------
DROP TABLE IF EXISTS `ldclass`;
CREATE TABLE `ldclass` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;