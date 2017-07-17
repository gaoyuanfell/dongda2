/*
Navicat MySQL Data Transfer

Source Server         : dongda
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dongda

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-16 21:48:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for r_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `r_menu_role`;
CREATE TABLE `r_menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(10) unsigned zerofill DEFAULT NULL,
  `menuId` int(10) unsigned zerofill DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_menu_role
-- ----------------------------
INSERT INTO `r_menu_role` VALUES ('25', '0000000006', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('26', '0000000006', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('27', '0000000006', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('28', '0000000006', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('29', '0000000006', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('30', '0000000006', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('31', '0000000006', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('32', '0000000006', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('33', '0000000006', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('34', '0000000006', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('35', '0000000006', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('36', '0000000006', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('37', '0000000006', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('38', '0000000006', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('39', '0000000006', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('40', '0000000006', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('41', '0000000006', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('42', '0000000006', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('43', '0000000006', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('44', '0000000006', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('45', '0000000006', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('46', '0000000006', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('47', '0000000006', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('53', '0000000002', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('54', '0000000002', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('55', '0000000002', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('56', '0000000002', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('57', '0000000002', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('58', '0000000003', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('59', '0000000003', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('60', '0000000003', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('61', '0000000003', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('62', '0000000003', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('63', '0000000003', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('64', '0000000003', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('65', '0000000003', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('66', '0000000003', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('100', '0000000001', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('101', '0000000001', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('102', '0000000001', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('103', '0000000001', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('104', '0000000001', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('105', '0000000001', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('106', '0000000001', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('107', '0000000001', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('108', '0000000001', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('109', '0000000001', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('110', '0000000001', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('111', '0000000001', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('112', '0000000001', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('113', '0000000001', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('114', '0000000001', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('115', '0000000001', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('116', '0000000001', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('117', '0000000001', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('118', '0000000001', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('119', '0000000001', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('120', '0000000001', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('121', '0000000001', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('122', '0000000001', '0000000022', null, null, null);

-- ----------------------------
-- Table structure for r_role_user
-- ----------------------------
DROP TABLE IF EXISTS `r_role_user`;
CREATE TABLE `r_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_role_user
-- ----------------------------
INSERT INTO `r_role_user` VALUES ('1', '1', '1', null, null, null);
INSERT INTO `r_role_user` VALUES ('3', '1', '3', null, null, null);
INSERT INTO `r_role_user` VALUES ('4', '1', '4', null, null, null);
INSERT INTO `r_role_user` VALUES ('5', '2', '4', null, null, null);
INSERT INTO `r_role_user` VALUES ('19', '6', '2', null, null, null);
INSERT INTO `r_role_user` VALUES ('20', '7', '6', null, null, null);

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company` (
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
  `companyAccount` varchar(255) DEFAULT NULL COMMENT '公司开户行账号',
  `taxCode` varchar(255) DEFAULT NULL COMMENT '公司纳税识别号',
  `applicationId` varchar(255) DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES ('1', '2017-07-16 06:53:17', null, '00000000000', '1', '超级1', '13870814611', '北京', '465716992@qq.com', '2', '北京银行', '1', '1', '1');
INSERT INTO `t_company` VALUES ('3', '2017-07-16 06:53:17', null, '00000000000', '1', '超级1', '13870814611', '北京', '465716992@qq.com', '1', '北京银行', '2', '1', 'f0da8668f77d8534eb08dfca0ed35d11');
INSERT INTO `t_company` VALUES ('4', '2017-07-16 06:53:17', '2017-07-16 07:48:49', '00000000000', '111111', '百度1111', '13870814612', '上海11111', '465716993@qq.com', '1', '北京银行', '3111', '111111', '1');
INSERT INTO `t_company` VALUES ('5', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度2', '13870814612', '上海2', '465716992@qq.com', '1', '北京银行', '4', '11', '1');
INSERT INTO `t_company` VALUES ('6', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度3', '13870814613', '上海3', '465716992@qq.com', '2', '北京银行', '4', '111', '1');
INSERT INTO `t_company` VALUES ('7', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度4', '13870814614', '上海4', '465716992@qq.com', '1', '北京银行', '4', '1111', '1');
INSERT INTO `t_company` VALUES ('8', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度5', '13870814615', '上海5', '465716992@qq.com', '2', '北京银行', '4', '11111', '1');
INSERT INTO `t_company` VALUES ('9', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度6', '13870814616', '上海6', '465716992@qq.com', '1', '北京银行', '4', '111111', '1');
INSERT INTO `t_company` VALUES ('10', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度7', '13870814617', '上海7', '465716992@qq.com', '2', '北京银行', '4', '1111111', '1');
INSERT INTO `t_company` VALUES ('11', '2017-07-16 07:16:41', null, '00000000000', '1', '阿里1', '13870814611', '1', '327085461@qq.com', '1', '1', null, '1', '1');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '客户名称',
  `companyId` int(10) unsigned zerofill DEFAULT NULL COMMENT '客户所属公司',
  `birthday` datetime DEFAULT NULL COMMENT '客户生日',
  `sex` varchar(255) DEFAULT NULL COMMENT '客户性别 0 默认 1男 2女',
  `contactAddress` varchar(255) DEFAULT NULL COMMENT '客户联系地址',
  `contactTel` varchar(255) DEFAULT NULL COMMENT '客户联系电话',
  `jobLevel` varchar(255) DEFAULT NULL COMMENT '客户职位',
  `email` varchar(255) DEFAULT NULL COMMENT '客户邮箱',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(10) unsigned zerofill DEFAULT NULL,
  `applicationId` varchar(255) DEFAULT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '张三1', '0000000001', '1992-09-29 17:00:00', '1', '上海', '13870814611', '前端', '465716992@qq.com', '2017-07-16 12:10:38', '2017-07-16 14:11:25', '0000000000', '1');
INSERT INTO `t_customer` VALUES ('3', '百度专员', '0000000004', '2017-07-27 18:00:00', '2', '北京', '1870814611', '百度专员', '465716992@qq.com', '2017-07-16 14:08:01', '2017-07-16 14:17:35', '0000000000', '1');

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `link` varchar(255) DEFAULT NULL COMMENT '菜单路由',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
  `parentId` int(11) DEFAULT NULL COMMENT '父级id',
  `isRoot` int(11) DEFAULT NULL COMMENT '是否根目录',
  `type` varchar(11) DEFAULT NULL COMMENT '0 菜单 1 链接 2功能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', null, null, '00000000000', '根目录', null, null, null, '1', '0');
INSERT INTO `t_menu` VALUES ('2', null, null, '00000000000', '首页', null, '&#xe601;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('3', null, null, '00000000000', '个人信息', null, '&#xe61c;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('4', null, null, '00000000000', '平台信息', null, '&#xe629;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('5', null, null, '00000000000', '权限', null, '&#xe62d;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('6', null, null, '00000000000', '合同信息', null, '&#xe63a;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('7', null, null, '00000000000', '发票信息', null, '&#xe647;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('8', null, null, '00000000000', '客户资料', null, '&#xe711;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('9', null, null, '00000000000', '销售计划', null, '&#xe644;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('10', null, null, '00000000000', '应收账款', null, '&#xe724;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('11', null, null, '00000000000', '报表', null, '&#xe639;', '1', '0', '0');
INSERT INTO `t_menu` VALUES ('12', null, null, '00000000000', '我的日程', 'index', null, '2', '0', '1');
INSERT INTO `t_menu` VALUES ('13', null, null, '00000000000', '个人信息', 'user', null, '3', '0', '1');
INSERT INTO `t_menu` VALUES ('14', null, null, '00000000000', '员工信息', 'platform', null, '4', '0', '1');
INSERT INTO `t_menu` VALUES ('15', null, null, '00000000000', '公司信息', 'company', null, '4', '0', '1');
INSERT INTO `t_menu` VALUES ('16', null, null, '00000000001', '查看权限', 'auth', null, '5', '0', '1');
INSERT INTO `t_menu` VALUES ('17', null, null, '00000000000', '合同信息', 'contract', null, '6', '0', '1');
INSERT INTO `t_menu` VALUES ('18', null, null, '00000000000', '发票信息', 'invoice', null, '7', '0', '1');
INSERT INTO `t_menu` VALUES ('19', null, null, '00000000000', '客户资料', 'customer', null, '8', '0', '1');
INSERT INTO `t_menu` VALUES ('20', null, null, '00000000000', '销售计划', 'sale', null, '9', '0', '1');
INSERT INTO `t_menu` VALUES ('21', null, null, '00000000000', '应收账款', 'money', null, '10', '0', '1');
INSERT INTO `t_menu` VALUES ('22', null, null, '00000000000', '报表', 'report', null, '11', '0', '1');
INSERT INTO `t_menu` VALUES ('23', null, null, '00000000000', '查看菜单', 'menu', null, '5', '0', '1');
INSERT INTO `t_menu` VALUES ('24', null, null, '00000000000', '查看角色', 'role', null, '5', '0', '1');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `applicationId` varchar(255) DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '管理员', '2017-07-09 11:29:49', null, '00000000000', '1');
INSERT INTO `t_role` VALUES ('2', '销售经理', '2017-07-09 12:14:09', null, '00000000000', '1');
INSERT INTO `t_role` VALUES ('3', '销售助理', '2017-07-09 12:14:59', null, '00000000000', '1');
INSERT INTO `t_role` VALUES ('4', '销售部助经理', '2017-07-09 12:15:58', null, '00000000000', '1');
INSERT INTO `t_role` VALUES ('6', '公司管理员', '2017-07-14 09:51:27', null, '00000000000', 'f0da8668f77d8534eb08dfca0ed35d11');
INSERT INTO `t_role` VALUES ('7', '出纳', '2017-07-14 17:40:46', null, '00000000000', 'f0da8668f77d8534eb08dfca0ed35d11');
INSERT INTO `t_role` VALUES ('9', '财务', '2017-07-16 05:48:19', null, '00000000000', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
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
  `applicationId` varchar(255) DEFAULT NULL COMMENT '资源ID',
  `companyId` int(11) unsigned zerofill DEFAULT NULL COMMENT '公司ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '2017-07-08 18:42:52', null, '00000000000', '管理员', '13870814611', '465716992@qq.com', 'b9e79361b4040a3f3a71668163d2f058', '1', null, null, null, null, '1', '00000000001');
INSERT INTO `t_user` VALUES ('2', '2017-07-14 09:51:22', null, '00000000000', '管理员', '13870814613', '465716993@qq.com', 'b9e79361b4040a3f3a71668163d2f058', '1', null, null, null, null, 'f0da8668f77d8534eb08dfca0ed35d11', '00000000003');
INSERT INTO `t_user` VALUES ('3', '2017-07-14 22:04:41', null, '00000000000', '张三1', '13870814622', '465716991@qq.com', 'b9e79361b4040a3f3a71668163d2f058', '1', null, null, null, null, '1', '00000000001');
INSERT INTO `t_user` VALUES ('4', '2017-07-15 09:28:11', null, '00000000000', '张三2', '13870814616', '465716996@qq.com', 'b9e79361b4040a3f3a71668163d2f058', '1', null, null, null, null, '1', '00000000001');
INSERT INTO `t_user` VALUES ('6', '2017-07-15 11:46:56', null, '00000000000', '李四', '13870814614', '465716994@qq.com', 'b9e79361b4040a3f3a71668163d2f058', '2', null, null, null, null, 'f0da8668f77d8534eb08dfca0ed35d11', '00000000003');
