/*
Navicat MySQL Data Transfer

Source Server         : dongda
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : moka

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-09 22:03:40
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('0', null, null, '00000000000', '根目录', null, null, null, '1');
INSERT INTO `menu` VALUES ('1', null, null, '00000000000', '首页', null, '&#xe601;', '0', '0');
INSERT INTO `menu` VALUES ('2', null, null, '00000000000', '个人信息', null, '&#xe61c;', '0', '0');
INSERT INTO `menu` VALUES ('3', null, null, '00000000000', '平台信息', null, '&#xe629;', '0', '0');
INSERT INTO `menu` VALUES ('4', null, null, '00000000000', '权限', null, '&#xe62d;', '0', '0');
INSERT INTO `menu` VALUES ('5', null, null, '00000000000', '合同信息', null, '&#xe63a;', '0', '0');
INSERT INTO `menu` VALUES ('6', null, null, '00000000000', '发票信息', null, '&#xe647;', '0', '0');
INSERT INTO `menu` VALUES ('7', null, null, '00000000000', '客户资料', null, '&#xe711;', '0', '0');
INSERT INTO `menu` VALUES ('8', null, null, '00000000000', '销售计划', null, '&#xe644;', '0', '0');
INSERT INTO `menu` VALUES ('9', null, null, '00000000000', '应收账款', null, '&#xe724;', '0', '0');
INSERT INTO `menu` VALUES ('10', null, null, '00000000000', '报表', null, '&#xe639;', '0', '0');
INSERT INTO `menu` VALUES ('11', null, null, '00000000000', '我的日程', 'index', null, '1', null);
INSERT INTO `menu` VALUES ('12', null, null, '00000000000', '个人信息', 'user', null, '2', null);
INSERT INTO `menu` VALUES ('13', null, null, '00000000000', '员工信息', 'platform', null, '3', null);
INSERT INTO `menu` VALUES ('14', null, null, '00000000000', '公司信息', 'company', null, '3', null);
INSERT INTO `menu` VALUES ('15', null, null, '00000000001', '查看权限', 'auth', null, '4', null);
INSERT INTO `menu` VALUES ('16', null, null, '00000000000', '合同信息', 'contract', null, '5', null);
INSERT INTO `menu` VALUES ('17', null, null, '00000000000', '发票信息', 'invoice', null, '6', null);
INSERT INTO `menu` VALUES ('18', null, null, '00000000000', '客户资料', 'customer', null, '7', null);
INSERT INTO `menu` VALUES ('19', null, null, '00000000000', '销售计划', 'sale', null, '8', null);
INSERT INTO `menu` VALUES ('20', null, null, '00000000000', '应收账款', 'money', null, '9', null);
INSERT INTO `menu` VALUES ('21', null, null, '00000000000', '报表', 'report', null, '10', null);
INSERT INTO `menu` VALUES ('22', null, null, '00000000000', '查看菜单', 'menu', null, '4', null);
INSERT INTO `menu` VALUES ('23', null, null, '00000000000', '查看角色', 'role', null, '4', null);

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
INSERT INTO `role` VALUES ('1', '管理员', '2017-07-09 11:29:49', null, '00000000000');
INSERT INTO `role` VALUES ('2', '销售经理', '2017-07-09 12:14:09', null, '00000000000');
INSERT INTO `role` VALUES ('3', '销售助理', '2017-07-09 12:14:59', null, '00000000000');
INSERT INTO `role` VALUES ('4', '销售部助经理', '2017-07-09 12:15:58', null, '00000000000');
INSERT INTO `role` VALUES ('5', '财务', '2017-07-09 12:16:11', null, '00000000000');

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
INSERT INTO `user` VALUES ('1', '2017-07-08 18:42:52', null, '00000000000', null, '13870814611', '465716992@qq.com', 'f379eaf3c831b04de153469d1bec345e', null, null, null, null, null);
