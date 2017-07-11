/*
Navicat MySQL Data Transfer

Source Server         : dongda
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dongda

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-10 23:40:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `companyCode` varchar(255) DEFAULT NULL COMMENT '注册号',
  `companyName` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `companyTel` varchar(255) DEFAULT NULL COMMENT '公司电话',
  `companyAddress` varchar(255) DEFAULT NULL COMMENT '公司地址',
  `companyEmail` varchar(255) DEFAULT NULL COMMENT '公司邮件',
  `regCapital` varchar(255) DEFAULT NULL COMMENT '注册资金',
  `corporateName` varchar(255) DEFAULT NULL COMMENT '法人代表',
  `operatingPeriod` varchar(255) DEFAULT NULL COMMENT '经营期限',
  `companyType` varchar(255) DEFAULT NULL COMMENT '企业类型',
  `registrationAuthority` varchar(255) DEFAULT NULL COMMENT '登记机关',
  `companyDate` datetime DEFAULT NULL COMMENT '成立时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `link` varchar(255) DEFAULT NULL COMMENT '菜单路由',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
  `parentId` int(11) DEFAULT NULL COMMENT '父级id',
  `isRoot` int(11) DEFAULT NULL COMMENT '是否根目录',
  `type` int(11) unsigned zerofill DEFAULT NULL COMMENT '0 菜单 1 链接 2功能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', null, null, '0', '根目录', null, null, null, '1', '0');
INSERT INTO `menu` VALUES ('2', null, null, '0', '首页', null, '&#xe601;', '1', '0', '0');
INSERT INTO `menu` VALUES ('3', null, null, '0', '个人信息', null, '&#xe61c;', '1', '0', '0');
INSERT INTO `menu` VALUES ('4', null, null, '0', '平台信息', null, '&#xe629;', '1', '0', '0');
INSERT INTO `menu` VALUES ('5', null, null, '0', '权限', null, '&#xe62d;', '1', '0', '0');
INSERT INTO `menu` VALUES ('6', null, null, '0', '合同信息', null, '&#xe63a;', '1', '0', '0');
INSERT INTO `menu` VALUES ('7', null, null, '0', '发票信息', null, '&#xe647;', '1', '0', '0');
INSERT INTO `menu` VALUES ('8', null, null, '0', '客户资料', null, '&#xe711;', '1', '0', '0');
INSERT INTO `menu` VALUES ('9', null, null, '0', '销售计划', null, '&#xe644;', '1', '0', '0');
INSERT INTO `menu` VALUES ('10', null, null, '0', '应收账款', null, '&#xe724;', '1', '0', '0');
INSERT INTO `menu` VALUES ('11', null, null, '0', '报表', null, '&#xe639;', '1', '0', '0');
INSERT INTO `menu` VALUES ('12', null, null, '0', '我的日程', 'index', null, '2', '0', '1');
INSERT INTO `menu` VALUES ('13', null, null, '0', '个人信息', 'user', null, '3', '0', '1');
INSERT INTO `menu` VALUES ('14', null, null, '0', '员工信息', 'platform', null, '4', '0', '1');
INSERT INTO `menu` VALUES ('15', null, null, '0', '公司信息', 'company', null, '4', '0', '1');
INSERT INTO `menu` VALUES ('16', null, null, '1', '查看权限', 'auth', null, '5', '0', '1');
INSERT INTO `menu` VALUES ('17', null, null, '0', '合同信息', 'contract', null, '6', '0', '1');
INSERT INTO `menu` VALUES ('18', null, null, '0', '发票信息', 'invoice', null, '7', '0', '1');
INSERT INTO `menu` VALUES ('19', null, null, '0', '客户资料', 'customer', null, '8', '0', '1');
INSERT INTO `menu` VALUES ('20', null, null, '0', '销售计划', 'sale', null, '9', '0', '1');
INSERT INTO `menu` VALUES ('21', null, null, '0', '应收账款', 'money', null, '10', '0', '1');
INSERT INTO `menu` VALUES ('22', null, null, '0', '报表', 'report', null, '11', '0', '1');
INSERT INTO `menu` VALUES ('23', null, null, '0', '查看菜单', 'menu', null, '5', '0', '1');
INSERT INTO `menu` VALUES ('24', null, null, '0', '查看角色', 'role', null, '5', '0', '1');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '2017-07-09 11:29:49', null, '0');
INSERT INTO `role` VALUES ('2', '销售经理', '2017-07-09 12:14:09', null, '0');
INSERT INTO `role` VALUES ('3', '销售助理', '2017-07-09 12:14:59', null, '0');
INSERT INTO `role` VALUES ('4', '销售部助经理', '2017-07-09 12:15:58', null, '0');
INSERT INTO `role` VALUES ('5', '财务', '2017-07-09 12:16:11', null, '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `phoneNumber` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `mail` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `employeeNo` int(11) DEFAULT NULL COMMENT '员工编号',
  `currAddress` varchar(255) DEFAULT NULL COMMENT '现住地址',
  `homeAdress` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `birthday` varchar(255) DEFAULT NULL COMMENT '出生日期',
  `idCardNo` int(11) DEFAULT NULL COMMENT '身份证号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2017-07-08 18:42:52', null, '0', null, '13870814611', '465716992@qq.com', 'f379eaf3c831b04de153469d1bec345e', null, null, null, null, null);
