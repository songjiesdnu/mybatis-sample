/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-wproot
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : mybatis-sample

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-07-18 10:57:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` varchar(32) NOT NULL DEFAULT '',
  `title` varchar(200) NOT NULL,
  `des` varchar(1000) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('100', '标题1', '描述1', '内容1');
INSERT INTO `blog` VALUES ('101', '标题101', '描述101', '内容101');
INSERT INTO `blog` VALUES ('102', '标题102', '描述102', '内容102');
