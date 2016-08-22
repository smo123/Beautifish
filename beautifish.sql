/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : beautifish

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-08-22 11:38:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for in_money
-- ----------------------------
DROP TABLE IF EXISTS `in_money`;
CREATE TABLE `in_money` (
  `money_id` varchar(255) NOT NULL,
  `from_uid` varchar(255) NOT NULL,
  `to_uid` varchar(255) NOT NULL,
  `money_amount` varchar(255) NOT NULL,
  `direct` varchar(255) DEFAULT NULL,
  `in_money_time` varchar(255) NOT NULL,
  `is_open` varchar(255) DEFAULT '0' COMMENT '红包是否被领取：未领取0；已领取1',
  `primary_key_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`primary_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_money
-- ----------------------------
INSERT INTO `in_money` VALUES ('0001111', '12424232', '342312', '222', 'SEND', '20160821', '1', '1');
INSERT INTO `in_money` VALUES ('00022222', '12424232', '342312', '222', 'SEND', '20160821', '1', '2');
INSERT INTO `in_money` VALUES ('00033333', '12424232', '342312', '222', 'SEND', '20160821', '1', '3');
INSERT INTO `in_money` VALUES ('0005555', '12424232', '342312', '222', 'SEND', '20160821', '1', '4');
INSERT INTO `in_money` VALUES ('00066666', '123456', '342312', '222', 'SEND', '20160821', '1', '5');
INSERT INTO `in_money` VALUES ('2323424', '00066666', '123456', '342312', 'SEND', '20160821', '', '6');
INSERT INTO `in_money` VALUES ('33333', '12424232', '342312', '222', 'SEND', '20160821', '1', '7');
INSERT INTO `in_money` VALUES ('33333', '12424232', '342312', '222', 'SEND', '20160821', '1', '8');
INSERT INTO `in_money` VALUES ('0001111', '12424232', '342312', '222', 'SEND', '20160821', '1', '9');
INSERT INTO `in_money` VALUES ('123456', '12424232', '342312', '222', 'SEND', '20160821', '1', '10');

-- ----------------------------
-- Table structure for myproduct
-- ----------------------------
DROP TABLE IF EXISTS `myproduct`;
CREATE TABLE `myproduct` (
  `product_id` varchar(255) NOT NULL,
  `icon` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `sales` varchar(255) NOT NULL COMMENT '销量',
  `sale_price` varchar(255) DEFAULT NULL COMMENT '活动价',
  `is_sale` varchar(255) DEFAULT NULL COMMENT '是否正在搞活动',
  `is_hot` varchar(255) DEFAULT NULL COMMENT '是否是火热产品',
  `is_recommend` varchar(255) DEFAULT NULL COMMENT '是否是推荐产品',
  `uid` varchar(255) NOT NULL,
  `buy_time` varchar(255) NOT NULL,
  `primary_key_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`primary_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myproduct
-- ----------------------------
INSERT INTO `myproduct` VALUES ('', '001', '标题1', '描述1', '10', '123', '5', '1', '1', '0', '66666', '', '1');
INSERT INTO `myproduct` VALUES ('', '002', '标题2', '描述2', '10', '23', '8', '1', '1', '0', '66666', '', '2');
INSERT INTO `myproduct` VALUES ('', '003', '标题3', '描述3', '34', '221', '12', '1', '1', '0', '01', '', '3');
INSERT INTO `myproduct` VALUES ('', 'dsd', 'ssdsd', 'dfsdf', '232', '2323', '232', '223', '23', '232', '232', '23232', '4');
INSERT INTO `myproduct` VALUES ('', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', 'è®¸è¿æ', '20160101', '5');
INSERT INTO `myproduct` VALUES ('8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', 'è®¸è¿æ', '20160101', '6');
INSERT INTO `myproduct` VALUES ('7777', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', '8888', 'è®¸è¿æ', '20160101', '7');

-- ----------------------------
-- Table structure for out_money
-- ----------------------------
DROP TABLE IF EXISTS `out_money`;
CREATE TABLE `out_money` (
  `money_id` varchar(255) NOT NULL,
  `applicant_uid` varchar(255) NOT NULL COMMENT '申请人ID',
  `applicant_uname` varchar(255) DEFAULT NULL COMMENT '申请人',
  `applicant_phone` varchar(255) NOT NULL,
  `applicant_wechat` varchar(255) NOT NULL,
  `applicant_alipay` varchar(255) DEFAULT NULL,
  `applicant_qq` varchar(255) NOT NULL,
  `money_amount` varchar(255) NOT NULL,
  `apply_time` varchar(255) NOT NULL COMMENT '申请时间',
  `handle_time` varchar(255) DEFAULT NULL COMMENT '处理时间',
  `handler` varchar(255) DEFAULT NULL COMMENT '处理人',
  `status_code` varchar(255) DEFAULT '0' COMMENT '状态码：未处理0；成功：1；失败2',
  `status_msg` varchar(255) DEFAULT NULL COMMENT '状态信息',
  `primary_key_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`primary_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of out_money
-- ----------------------------
INSERT INTO `out_money` VALUES ('00066666', '123456', null, '342312', '222', null, 'SEND', '20160821', '1', null, null, null, null, '1');
INSERT INTO `out_money` VALUES ('063333666', '123456', null, '342312', '222', null, 'SEND', '20160821', '1', null, null, null, null, '2');
INSERT INTO `out_money` VALUES ('06666', '123456', null, '342312', '222', null, 'SEND', '20160821', '1', null, null, null, null, '3');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `
product_id` varchar(255) NOT NULL,
  `icon` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `sales` varchar(255) NOT NULL COMMENT '销量',
  `sale_price` varchar(255) DEFAULT NULL COMMENT '活动价',
  `is_sale` varchar(255) DEFAULT NULL COMMENT '是否正在搞活动',
  `is_hot` varchar(255) DEFAULT NULL COMMENT '是否是火热产品',
  `is_recommend` varchar(255) DEFAULT NULL COMMENT '是否是推荐产品',
  `primary_key_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`primary_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('001', '001', '标题1', '描述1', '10', '123', '5', '1', '1', '0', '1');
INSERT INTO `product` VALUES ('002', '002', '标题2', '描述2', '10', '23', '8', '1', '1', '0', '2');
INSERT INTO `product` VALUES ('003', '003', '标题3', '描述3', '34', '221', '12', '1', '1', '0', '3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `wechat` varchar(255) NOT NULL,
  `qq` varchar(255) NOT NULL,
  `alipay` varchar(255) DEFAULT NULL,
  `parent` varchar(255) NOT NULL,
  `money` varchar(255) DEFAULT NULL,
  `registerTime` varchar(255) NOT NULL,
  `primary_key_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`primary_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('01', 'A1', '868688', '18775769565', 'kiwjd', '3408393', null, '23244', '111', '', '1');
INSERT INTO `user` VALUES ('02', 'A2', '868688', '18775769565', 'kiwjd', '3408393', '23ssds', '23244', '111', '', '2');
INSERT INTO `user` VALUES ('66666', 'kinpo', '868688', '18775769565', 'smo321', '919411433', 'alipay', '2321312', '122', '342343253', '3');
SET FOREIGN_KEY_CHECKS=1;
