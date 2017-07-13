/*
Navicat MySQL Data Transfer

Source Server         : moka
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : dongda

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-13 18:54:44
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
  `companyType` varchar(255) DEFAULT NULL COMMENT '企业类型',
  `companyBank` varchar(255) DEFAULT NULL COMMENT '公司开户行',
  `taxCode` varchar(255) DEFAULT NULL COMMENT '公司纳税识别号',
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
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', null, null, '00000000000', '根目录', null, null, null, '1', '00000000000');
INSERT INTO `menu` VALUES ('2', null, null, '00000000000', '首页', null, '&#xe601;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('3', null, null, '00000000000', '个人信息', null, '&#xe61c;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('4', null, null, '00000000000', '平台信息', null, '&#xe629;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('5', null, null, '00000000000', '权限', null, '&#xe62d;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('6', null, null, '00000000000', '合同信息', null, '&#xe63a;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('7', null, null, '00000000000', '发票信息', null, '&#xe647;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('8', null, null, '00000000000', '客户资料', null, '&#xe711;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('9', null, null, '00000000000', '销售计划', null, '&#xe644;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('10', null, null, '00000000000', '应收账款', null, '&#xe724;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('11', null, null, '00000000000', '报表', null, '&#xe639;', '1', '0', '00000000000');
INSERT INTO `menu` VALUES ('12', null, null, '00000000000', '我的日程', 'index', null, '2', '0', '00000000001');
INSERT INTO `menu` VALUES ('13', null, null, '00000000000', '个人信息', 'user', null, '3', '0', '00000000001');
INSERT INTO `menu` VALUES ('14', null, null, '00000000000', '员工信息', 'platform', null, '4', '0', '00000000001');
INSERT INTO `menu` VALUES ('15', null, null, '00000000000', '公司信息', 'company', null, '4', '0', '00000000001');
INSERT INTO `menu` VALUES ('16', null, null, '00000000001', '查看权限', 'auth', null, '5', '0', '00000000001');
INSERT INTO `menu` VALUES ('17', null, null, '00000000000', '合同信息', 'contract', null, '6', '0', '00000000001');
INSERT INTO `menu` VALUES ('18', null, null, '00000000000', '发票信息', 'invoice', null, '7', '0', '00000000001');
INSERT INTO `menu` VALUES ('19', null, null, '00000000000', '客户资料', 'customer', null, '8', '0', '00000000001');
INSERT INTO `menu` VALUES ('20', null, null, '00000000000', '销售计划', 'sale', null, '9', '0', '00000000001');
INSERT INTO `menu` VALUES ('21', null, null, '00000000000', '应收账款', 'money', null, '10', '0', '00000000001');
INSERT INTO `menu` VALUES ('22', null, null, '00000000000', '报表', 'report', null, '11', '0', '00000000001');
INSERT INTO `menu` VALUES ('23', null, null, '00000000000', '查看菜单', 'menu', null, '5', '0', '00000000001');
INSERT INTO `menu` VALUES ('24', null, null, '00000000000', '查看角色', 'role', null, '5', '0', '00000000001');

-- ----------------------------
-- Table structure for menu_role
-- ----------------------------
DROP TABLE IF EXISTS `menu_role`;
CREATE TABLE `menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(10) unsigned zerofill DEFAULT NULL,
  `menuId` int(10) unsigned zerofill DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_role
-- ----------------------------
INSERT INTO `menu_role` VALUES ('35', '0000000005', '0000000001', null, null, null);
INSERT INTO `menu_role` VALUES ('36', '0000000005', '0000000010', null, null, null);
INSERT INTO `menu_role` VALUES ('37', '0000000005', '0000000021', null, null, null);
INSERT INTO `menu_role` VALUES ('38', '0000000005', '0000000011', null, null, null);
INSERT INTO `menu_role` VALUES ('39', '0000000005', '0000000022', null, null, null);
INSERT INTO `menu_role` VALUES ('40', '0000000001', '0000000001', null, null, null);
INSERT INTO `menu_role` VALUES ('41', '0000000001', '0000000002', null, null, null);
INSERT INTO `menu_role` VALUES ('42', '0000000001', '0000000012', null, null, null);
INSERT INTO `menu_role` VALUES ('43', '0000000001', '0000000003', null, null, null);
INSERT INTO `menu_role` VALUES ('44', '0000000001', '0000000013', null, null, null);
INSERT INTO `menu_role` VALUES ('45', '0000000002', '0000000001', null, null, null);
INSERT INTO `menu_role` VALUES ('46', '0000000002', '0000000008', null, null, null);
INSERT INTO `menu_role` VALUES ('47', '0000000002', '0000000019', null, null, null);
INSERT INTO `menu_role` VALUES ('48', '0000000002', '0000000009', null, null, null);
INSERT INTO `menu_role` VALUES ('49', '0000000002', '0000000020', null, null, null);

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
-- Table structure for role_user
-- ----------------------------
DROP TABLE IF EXISTS `role_user`;
CREATE TABLE `role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_user
-- ----------------------------
INSERT INTO `role_user` VALUES ('1', '1', '1', null, null, null);
INSERT INTO `role_user` VALUES ('2', '2', '1', null, null, null);

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
