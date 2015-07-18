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
