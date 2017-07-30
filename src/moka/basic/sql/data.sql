/*
Navicat MySQL Data Transfer

Source Server         : dongda
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dongda

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-30 23:18:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for r_company_admin
-- ----------------------------
DROP TABLE IF EXISTS `r_company_admin`;
CREATE TABLE `r_company_admin` (
  `companyAdminId` varchar(255) DEFAULT NULL COMMENT '财务公司ID',
  `companyId` varchar(255) DEFAULT NULL COMMENT '被管理公司',
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源ID',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `relationState` varchar(255) DEFAULT '' COMMENT '关联状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_company_admin
-- ----------------------------
INSERT INTO `r_company_admin` VALUES ('22', '20', 'f4ba890aa9451747', '2017-07-23 16:15:39', null, '0', '1');
INSERT INTO `r_company_admin` VALUES ('22', '3', 'f0da8668f77d8534eb08dfca0ed35d11', null, null, '0', '1');

-- ----------------------------
-- Table structure for r_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `r_menu_role`;
CREATE TABLE `r_menu_role` (
  `roleId` varchar(255) DEFAULT NULL,
  `menuId` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_menu_role
-- ----------------------------
INSERT INTO `r_menu_role` VALUES (null, '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES (null, '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000001', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000010', '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000011', '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000012', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000013', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000002', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000003', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000004', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000005', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000017', '0000000025', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000008', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000009', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000012', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000013', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000014', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000015', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000019', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000020', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000023', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000006', '0000000024', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000002', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000002', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000002', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000002', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000002', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000001', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000006', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000017', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000007', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000018', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000010', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000021', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000011', null, null, null);
INSERT INTO `r_menu_role` VALUES ('0000000003', '0000000022', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '1', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '10', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '11', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '12', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '13', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '14', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '15', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '17', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '18', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '19', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '2', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '20', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '21', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '22', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '23', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '24', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '25', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '3', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '4', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '5', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '6', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '7', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '8', null, null, null);
INSERT INTO `r_menu_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '9', null, null, null);

-- ----------------------------
-- Table structure for r_role_user_company
-- ----------------------------
DROP TABLE IF EXISTS `r_role_user_company`;
CREATE TABLE `r_role_user_company` (
  `userId` varchar(255) DEFAULT NULL,
  `roleId` varchar(255) DEFAULT NULL,
  `companyId` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_role_user_company
-- ----------------------------
INSERT INTO `r_role_user_company` VALUES (null, null, null, null, null, null);
INSERT INTO `r_role_user_company` VALUES ('233fe73f753511e7a337c8d3ffe4d7bf', '2341e836753511e7a337c8d3ffe4d7bf', '233ea640753511e7a337c8d3ffe4d7bf', null, null, null);

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company` (
  `id` varchar(255) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `companyCode` varchar(255) DEFAULT '' COMMENT '注册号',
  `companyName` varchar(255) DEFAULT '' COMMENT '公司名称',
  `companyTel` varchar(255) DEFAULT '' COMMENT '公司电话',
  `companyAddress` varchar(255) DEFAULT '' COMMENT '公司地址',
  `companyEmail` varchar(255) DEFAULT '' COMMENT '公司邮件',
  `companyType` varchar(255) DEFAULT '' COMMENT '企业类型',
  `companyBank` varchar(255) DEFAULT '' COMMENT '公司开户行',
  `companyAccount` varchar(255) DEFAULT '' COMMENT '公司开户行账号',
  `taxCode` varchar(255) DEFAULT '' COMMENT '公司纳税识别号',
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源ID',
  `companyBelong` varchar(255) DEFAULT '' COMMENT '公司所属 1内部 2外部（客户公司）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES ('0765ccb5751611e7891000163e066f16', null, null, '00000000000', null, null, null, null, null, null, null, null, null, 'bd46bbc60ce0337d', null);
INSERT INTO `t_company` VALUES ('1', '2017-07-16 06:53:17', null, '00000000000', '1', '超级1', '13870814611', '北京', '465716992@qq.com', '2', '北京银行', '1', '1', '1', null);
INSERT INTO `t_company` VALUES ('10', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度7', '13870814617', '上海7', '465716992@qq.com', '2', '北京银行', '4', '1111111', '1', null);
INSERT INTO `t_company` VALUES ('11', '2017-07-16 07:16:41', null, '00000000000', '1', '阿里1', '13870814611', '1', '327085461@qq.com', '1', '1', null, '1', '1', null);
INSERT INTO `t_company` VALUES ('12', null, null, '00000000000', null, null, null, null, null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '1');
INSERT INTO `t_company` VALUES ('13', '2017-07-20 12:18:21', null, '00000000000', null, '上海廷桥', null, null, null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '2');
INSERT INTO `t_company` VALUES ('14', '2017-07-21 04:20:20', null, '00000000000', null, '膜拜', null, '上海', null, '1', null, null, null, 'd3a1f90441cff9636152bf9935664515', '1');
INSERT INTO `t_company` VALUES ('15', '2017-07-21 04:20:25', null, '00000000000', null, '华为', null, '南京', null, '1', null, null, null, 'd3a1f90441cff9636152bf9935664515', '2');
INSERT INTO `t_company` VALUES ('16', '2017-07-21 08:37:44', null, '00000000000', null, '腾讯', null, '深圳', null, '1', null, null, null, 'd3a1f90441cff9636152bf9935664515', '1');
INSERT INTO `t_company` VALUES ('17', '2017-07-21 08:38:37', null, '00000000000', null, '阿里巴巴', null, '杭州', null, '1', null, null, null, 'd3a1f90441cff9636152bf9935664515', '2');
INSERT INTO `t_company` VALUES ('18', '2017-07-21 08:39:18', null, '00000000000', null, '美团', null, '上海', null, '1', null, null, null, 'd3a1f90441cff9636152bf9935664515', '1');
INSERT INTO `t_company` VALUES ('19', '2017-07-21 10:47:57', null, '00000000000', null, null, null, null, null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', null);
INSERT INTO `t_company` VALUES ('20', '2017-07-23 12:17:53', null, '00000000000', '001', '内部公司', '17770085046', '上海', '465716992@qq.com', '1', '平安银行', '001', '001', 'f4ba890aa9451747', '1');
INSERT INTO `t_company` VALUES ('21', '2017-07-23 12:19:11', null, '00000000000', '002', '外部公司', '17770085048', '北京', '465716993@qq.com', '1', '招商银行', '002', '002', 'f4ba890aa9451747', '2');
INSERT INTO `t_company` VALUES ('22', '2017-07-23 12:52:40', null, '00000000000', '010', '财务公司', '13870814612', '深证', '465716993@qq.com', '2', '中国银行', '010', '010', '26f0f847f9d21372', '1');
INSERT INTO `t_company` VALUES ('23', '2017-07-23 15:47:30', null, '00000000000', '030', '客户公司1', '13870814618', '上海', '465716998@qq.com', '1', '北京银行', '030', '030', '26f0f847f9d21372', '2');
INSERT INTO `t_company` VALUES ('233ea640753511e7a337c8d3ffe4d7bf', null, null, '00000000000', null, null, null, null, null, null, null, null, null, 'c60d203a14db776b', null);
INSERT INTO `t_company` VALUES ('24', '2017-07-24 09:08:33', null, '00000000000', null, '阿里巴巴吧', null, null, null, null, null, null, null, 'f4ba890aa9451747', '2');
INSERT INTO `t_company` VALUES ('25', '2017-07-25 07:41:36', null, '00000000000', null, '上海廷桥信息技术有限公司', null, null, null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '2');
INSERT INTO `t_company` VALUES ('3', '2017-07-16 06:53:17', null, '00000000000', '1', '超级1', '13870814611', '北京', '465716992@qq.com', '1', '北京银行', '2', '1', 'f0da8668f77d8534eb08dfca0ed35d11', null);
INSERT INTO `t_company` VALUES ('4', '2017-07-16 06:53:17', '2017-07-16 07:48:49', '00000000000', '111111', '百度1111', '13870814612', '上海11111', '465716993@qq.com', '1', '北京银行', '3111', '111111', '1', null);
INSERT INTO `t_company` VALUES ('5', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度2', '13870814612', '上海2', '465716992@qq.com', '1', '北京银行', '4', '11', '1', null);
INSERT INTO `t_company` VALUES ('6', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度3', '13870814613', '上海3', '465716992@qq.com', '2', '北京银行', '4', '111', '1', null);
INSERT INTO `t_company` VALUES ('7', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度4', '13870814614', '上海4', '465716992@qq.com', '1', '北京银行', '4', '1111', '1', null);
INSERT INTO `t_company` VALUES ('8', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度5', '13870814615', '上海5', '465716992@qq.com', '2', '北京银行', '4', '11111', '1', null);
INSERT INTO `t_company` VALUES ('9', '2017-07-16 06:53:17', '2017-07-13 13:12:09', '00000000000', '1', '百度6', '13870814616', '上海6', '465716992@qq.com', '1', '北京银行', '4', '111111', '1', null);

-- ----------------------------
-- Table structure for t_contract
-- ----------------------------
DROP TABLE IF EXISTS `t_contract`;
CREATE TABLE `t_contract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '合同创建时间',
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `contractNo` varchar(50) NOT NULL DEFAULT '' COMMENT '合同编号',
  `versionNo` int(11) NOT NULL DEFAULT '1' COMMENT '版本号',
  `companyIdA` varchar(255) NOT NULL DEFAULT '0' COMMENT '甲方公司ID',
  `companyContractIdA` varchar(255) NOT NULL DEFAULT '0' COMMENT '甲方联络人ID',
  `companyIdB` varchar(255) NOT NULL DEFAULT '0',
  `companyContractIdB` varchar(255) NOT NULL DEFAULT '0',
  `companyIdC` varchar(255) DEFAULT NULL,
  `companyContractIdC` varchar(255) DEFAULT NULL,
  `signDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '签订日期',
  `startDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '合同生效日期',
  `endDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '合同结束日期',
  `itemName` varchar(50) NOT NULL DEFAULT '' COMMENT '项目名称',
  `item` varchar(50) NOT NULL DEFAULT '' COMMENT '货物或服务',
  `amt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '合同金额',
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源ID',
  `contactType` varchar(255) DEFAULT '' COMMENT '合同类型',
  `contactState` varchar(255) DEFAULT '' COMMENT '合同状态',
  `remark` varchar(255) DEFAULT '' COMMENT '备注',
  `paymentNum` int(10) unsigned zerofill DEFAULT NULL COMMENT '付款期数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='合同表';

-- ----------------------------
-- Records of t_contract
-- ----------------------------
INSERT INTO `t_contract` VALUES ('10', '2017-07-22 08:58:18', null, '0', 'TXBAIDU01', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-07-04 18:00:00', '2017-07-30 18:00:00', '测试名称', '测试服务', '200000.00', '1', null, '1', null, '0000000003');
INSERT INTO `t_contract` VALUES ('11', '2017-07-22 08:58:38', null, '0', 'TXBAIDU02', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-08-30 18:00:00', '测试名称', '测试服务', '2000000.00', '1', null, '1', null, '0000000005');
INSERT INTO `t_contract` VALUES ('12', '2017-07-22 08:58:47', null, '0', 'TXBAIDU03', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-08-30 18:00:00', '测试名称', '测试服务', '200000.00', '1', null, '1', null, '0000000006');
INSERT INTO `t_contract` VALUES ('13', '2017-07-22 08:59:01', null, '0', 'TXBAIDU04', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-08-30 18:00:00', '测试名称', '测试服务', '562300.00', '1', null, '1', null, '0000000007');
INSERT INTO `t_contract` VALUES ('14', '2017-07-22 08:59:18', null, '0', 'TXBAIDU05', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-09-28 18:00:00', '测试名称', '测试服务', '5623000.00', '1', null, '1', null, '0000000003');
INSERT INTO `t_contract` VALUES ('15', '2017-07-22 08:59:41', null, '0', 'TXBAIDU06', '0', '4', '3', '1', '1', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-08-16 18:00:00', '测试名称', '测试服务', '3250140.00', '1', null, '1', null, '0000000006');
INSERT INTO `t_contract` VALUES ('16', '2017-07-24 05:39:48', null, '0', 'TX20170724', '0', '21', '4', '20', '18', '0', '0', '2017-06-30 18:00:00', '2017-06-30 18:00:00', '2017-08-30 18:00:00', '测试1', '测试服务', '200000.00', 'f4ba890aa9451747', null, '1', null, '0000000003');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '客户名称',
  `companyId` varchar(255) DEFAULT NULL COMMENT '客户所属公司',
  `birthday` datetime DEFAULT NULL COMMENT '客户生日',
  `sex` varchar(255) DEFAULT NULL COMMENT '客户性别 0 默认 1男 2女',
  `contactAddress` varchar(255) DEFAULT '' COMMENT '客户联系地址',
  `contactTel` varchar(255) DEFAULT '' COMMENT '客户联系电话',
  `jobLevel` varchar(255) DEFAULT '' COMMENT '客户职位',
  `email` varchar(255) DEFAULT NULL COMMENT '客户邮箱',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(10) unsigned zerofill DEFAULT NULL,
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '张三1', '0000000001', '1992-09-29 17:00:00', '1', '上海', '13870814611', '前端', '465716992@qq.com', '2017-07-16 12:10:38', '2017-07-19 17:55:25', '0000000000', '1');
INSERT INTO `t_customer` VALUES ('10', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:50:58', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('11', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:54:00', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('12', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:55:38', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('13', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:58:15', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('14', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:59:18', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('15', '王震', '0000000000', null, null, null, null, null, null, '2017-07-25 08:04:04', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('16', '王源', '0000000000', null, null, null, null, null, null, '2017-07-25 08:11:38', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('17', '王若愚', '0000000000', null, null, null, null, null, null, '2017-07-25 08:15:37', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('18', '王若愚', '0000000000', null, null, null, null, null, null, '2017-07-25 08:16:04', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('19', '王若愚', '0000000000', null, null, null, null, null, null, '2017-07-25 08:17:03', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('20', '王若愚', '0000000000', null, null, null, null, null, null, '2017-07-25 08:17:52', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('21', '王若愚', '0000000000', null, null, null, null, null, null, '2017-07-25 08:20:43', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('22', '易烊千玺', '0000000000', null, null, null, null, null, null, '2017-07-25 08:22:04', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('23', '周杰伦', '0000000025', null, null, null, null, null, null, '2017-07-25 08:33:49', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('3', '百度专员', '0000000004', '2017-07-27 18:00:00', '2', '北京', '1870814611', '百度专员', '465716992@qq.com', '2017-07-16 14:08:01', '2017-07-19 17:55:35', '0000000000', '1');
INSERT INTO `t_customer` VALUES ('4', '客户1', '0000000021', '2017-07-20 18:00:00', '1', '上海', '13870814623', '销售', '465716998@qq.com', '2017-07-24 04:57:50', null, '0000000000', 'f4ba890aa9451747');
INSERT INTO `t_customer` VALUES ('5', '客户2', '0000000021', '2017-07-27 18:00:00', '1', '北京', '13870814625', '销售', '465716998@qq.com', '2017-07-24 05:00:23', null, '0000000000', 'f4ba890aa9451747');
INSERT INTO `t_customer` VALUES ('6', '章太炎', '0000000000', null, '1', '南京', null, null, null, '2017-07-25 07:31:03', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('7', '王若愚', '0000000000', null, '1', '上海', null, null, null, '2017-07-25 07:31:28', null, '0000000000', 'd3a1f90441cff9636152bf9935664515');
INSERT INTO `t_customer` VALUES ('8', '系统安全检查', '0000000000', null, null, null, null, null, null, '2017-07-25 07:41:37', null, '0000000000', null);
INSERT INTO `t_customer` VALUES ('9', '王若愚大侠', '0000000000', null, null, null, null, null, null, '2017-07-25 07:47:05', null, '0000000000', null);

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `id` varchar(255) NOT NULL,
  `contractId` varchar(255) NOT NULL DEFAULT '0',
  `paymentPlan` int(11) NOT NULL DEFAULT '0' COMMENT '开票批次',
  `createDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updateDate` datetime DEFAULT NULL,
  `goodsName` varchar(60) NOT NULL DEFAULT '' COMMENT '货物或应税劳务，服务名称',
  `specModel` varchar(30) DEFAULT '' COMMENT '规格型号',
  `unitMeasurement` varchar(10) DEFAULT '' COMMENT '单位',
  `goodsNum` int(11) NOT NULL DEFAULT '0' COMMENT '数量',
  `unitPrice` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '单价',
  `amtWithoutTax` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '不含税金额',
  `rate` float(4,3) NOT NULL DEFAULT '0.000' COMMENT '税率',
  `amtOfTax` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '税额',
  `amt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '价税金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货物详情';

-- ----------------------------
-- Records of t_goods
-- ----------------------------

-- ----------------------------
-- Table structure for t_interface
-- ----------------------------
DROP TABLE IF EXISTS `t_interface`;
CREATE TABLE `t_interface` (
  `id` varchar(255) NOT NULL,
  `state` int(1) NOT NULL DEFAULT '0',
  `name` varchar(30) DEFAULT '',
  `createDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updateDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='接口表';

-- ----------------------------
-- Records of t_interface
-- ----------------------------

-- ----------------------------
-- Table structure for t_invoice
-- ----------------------------
DROP TABLE IF EXISTS `t_invoice`;
CREATE TABLE `t_invoice` (
  `id` varchar(255) NOT NULL,
  `contractId` varchar(255) NOT NULL DEFAULT '0' COMMENT '所属合同ID',
  `paymentPlanFact` int(11) NOT NULL DEFAULT '0' COMMENT '实际开票计划批次',
  `planInvoiceDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划开票日期',
  `factIncoiveDate` datetime DEFAULT NULL COMMENT '实际开票日期',
  `planPaymentDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计付款日期',
  `factPaymentDate` datetime DEFAULT NULL COMMENT '实际付款日期',
  `companyPayId` int(11) NOT NULL DEFAULT '0' COMMENT '购买方公司ID',
  `companySaleId` int(11) NOT NULL DEFAULT '0' COMMENT '销售方公司ID',
  `payeeName` varchar(30) NOT NULL DEFAULT '' COMMENT '收款人姓名',
  `checkName` varchar(30) NOT NULL DEFAULT '' COMMENT '复核人姓名',
  `billingName` varchar(30) NOT NULL DEFAULT '' COMMENT '开票人姓名',
  `amtWithoutTax` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '不含税金额',
  `rate` float(4,3) NOT NULL DEFAULT '0.000' COMMENT '税率',
  `amtOfTax` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '税额',
  `amt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '价税金额',
  `remaeks` varchar(120) DEFAULT '' COMMENT '备注',
  `state` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发票表';

-- ----------------------------
-- Records of t_invoice
-- ----------------------------

-- ----------------------------
-- Table structure for t_invoice_plan
-- ----------------------------
DROP TABLE IF EXISTS `t_invoice_plan`;
CREATE TABLE `t_invoice_plan` (
  `id` varchar(255) NOT NULL,
  `contractId` varchar(255) NOT NULL DEFAULT '0' COMMENT '合同ID',
  `paymentPlanFact` int(11) NOT NULL DEFAULT '0' COMMENT '此次开票次数',
  `versionNo` int(11) NOT NULL DEFAULT '1' COMMENT '对应合同版本号',
  `amt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '金额',
  `planDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划开票日期',
  `planReceiveDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计收款日期',
  `receiveAmt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '已入账金额',
  `state` int(11) NOT NULL DEFAULT '0',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `planState` varchar(255) DEFAULT '' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='开票计划';

-- ----------------------------
-- Records of t_invoice_plan
-- ----------------------------
INSERT INTO `t_invoice_plan` VALUES ('26', '10', '1', '0', '66660.00', '2017-07-11 18:00:00', '2017-07-12 18:00:00', '0.00', '0', '2017-07-22 08:58:23', '2017-07-22 10:10:22', '1');
INSERT INTO `t_invoice_plan` VALUES ('27', '10', '2', '0', '66666.00', '2017-07-20 18:00:00', '2017-07-20 18:00:00', '0.00', '0', '2017-07-22 08:58:23', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('28', '10', '3', '0', '66668.00', '2017-07-30 18:00:00', '2017-07-30 18:00:00', '0.00', '0', '2017-07-22 08:58:23', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('29', '11', '1', '0', '400000.00', '2017-07-12 18:00:00', '2017-07-12 18:00:00', '0.00', '0', '2017-07-22 08:58:38', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('30', '11', '2', '0', '400000.00', '2017-07-24 18:00:00', '2017-07-24 18:00:00', '0.00', '0', '2017-07-22 08:58:38', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('31', '11', '3', '0', '400000.00', '2017-08-05 18:00:00', '2017-08-05 18:00:00', '0.00', '0', '2017-07-22 08:58:38', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('32', '11', '4', '0', '400000.00', '2017-08-17 18:00:00', '2017-08-17 18:00:00', '0.00', '0', '2017-07-22 08:58:38', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('33', '11', '5', '0', '400000.00', '2017-08-30 18:00:00', '2017-08-30 18:00:00', '0.00', '0', '2017-07-22 08:58:38', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('34', '12', '1', '0', '33333.00', '2017-07-10 18:00:00', '2017-07-10 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('35', '12', '2', '0', '33333.00', '2017-07-20 18:00:00', '2017-07-20 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('36', '12', '3', '0', '33333.00', '2017-07-30 18:00:00', '2017-07-30 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('37', '12', '4', '0', '33333.00', '2017-08-09 18:00:00', '2017-08-09 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('38', '12', '5', '0', '33333.00', '2017-08-19 18:00:00', '2017-08-19 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('39', '12', '6', '0', '33335.00', '2017-08-30 18:00:00', '2017-08-30 18:00:00', '0.00', '0', '2017-07-22 08:58:47', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('40', '13', '1', '0', '80328.00', '2017-07-08 18:00:00', '2017-07-08 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('41', '13', '2', '0', '80328.00', '2017-07-16 18:00:00', '2017-07-16 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('42', '13', '3', '0', '80328.00', '2017-07-24 18:00:00', '2017-07-24 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('43', '13', '4', '0', '80328.00', '2017-08-01 18:00:00', '2017-08-01 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('44', '13', '5', '0', '80328.00', '2017-08-09 18:00:00', '2017-08-09 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('45', '13', '6', '0', '80328.00', '2017-08-17 18:00:00', '2017-08-17 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('46', '13', '7', '0', '80332.00', '2017-08-30 18:00:00', '2017-08-30 18:00:00', '0.00', '0', '2017-07-22 08:59:01', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('47', '14', '1', '0', '1874330.00', '2017-07-29 18:00:00', '2017-07-29 18:00:00', '0.00', '0', '2017-07-22 08:59:18', '2017-07-22 09:58:57', '1');
INSERT INTO `t_invoice_plan` VALUES ('48', '14', '2', '0', '1874336.00', '2017-08-30 18:00:00', '2017-08-30 18:00:00', '0.00', '0', '2017-07-22 08:59:18', '2017-07-22 09:59:41', '1');
INSERT INTO `t_invoice_plan` VALUES ('49', '14', '3', '0', '1874334.00', '2017-09-28 18:00:00', '2017-09-28 18:00:00', '0.00', '0', '2017-07-22 08:59:18', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('50', '15', '1', '0', '541690.00', '2017-07-07 18:00:00', '2017-07-07 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('51', '15', '2', '0', '541690.00', '2017-07-14 18:00:00', '2017-07-14 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('52', '15', '3', '0', '541690.00', '2017-07-21 18:00:00', '2017-07-21 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('53', '15', '4', '0', '541690.00', '2017-07-28 18:00:00', '2017-07-28 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('54', '15', '5', '0', '541690.00', '2017-08-04 18:00:00', '2017-08-04 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('55', '15', '6', '0', '541690.00', '2017-08-16 18:00:00', '2017-08-16 18:00:00', '0.00', '0', '2017-07-22 08:59:41', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('56', '16', '1', '0', '66666.00', '2017-07-20 18:00:00', '2017-07-20 18:00:00', '0.00', '0', '2017-07-24 05:39:48', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('57', '16', '2', '0', '66666.00', '2017-08-09 18:00:00', '2017-08-09 18:00:00', '0.00', '0', '2017-07-24 05:39:48', null, '1');
INSERT INTO `t_invoice_plan` VALUES ('58', '16', '3', '0', '66668.00', '2017-08-30 18:00:00', '2017-08-30 18:00:00', '0.00', '0', '2017-07-24 05:39:48', null, '1');

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` varchar(255) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '菜单名称',
  `link` varchar(255) DEFAULT '' COMMENT '菜单路由',
  `icon` varchar(255) DEFAULT '' COMMENT '菜单图标',
  `parentId` varchar(11) DEFAULT NULL COMMENT '父级id',
  `isRoot` int(11) DEFAULT NULL COMMENT '是否根目录',
  `type` varchar(11) DEFAULT '' COMMENT '0 菜单 1 链接 2功能',
  `order` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', null, null, '00000000000', '根目录', null, null, null, '1', '0', null);
INSERT INTO `t_menu` VALUES ('10', null, null, '00000000000', '应收账款', null, '&#xe724;', '1', '0', '0', '9');
INSERT INTO `t_menu` VALUES ('11', null, null, '00000000000', '报表', null, '&#xe639;', '1', '0', '0', '10');
INSERT INTO `t_menu` VALUES ('12', null, null, '00000000000', '我的日程', 'index', null, '2', '0', '1', null);
INSERT INTO `t_menu` VALUES ('13', null, null, '00000000000', '个人信息', 'user', null, '3', '0', '1', null);
INSERT INTO `t_menu` VALUES ('14', null, null, '00000000000', '员工信息', 'platform', null, '4', '0', '1', null);
INSERT INTO `t_menu` VALUES ('15', null, null, '00000000000', '公司信息', 'company', null, '4', '0', '1', null);
INSERT INTO `t_menu` VALUES ('16', null, null, '00000000001', '查看权限', 'auth', null, '5', '0', '1', null);
INSERT INTO `t_menu` VALUES ('17', null, null, '00000000000', '合同信息', 'contract', null, '6', '0', '1', null);
INSERT INTO `t_menu` VALUES ('18', null, null, '00000000000', '发票信息', 'invoice', null, '7', '0', '1', null);
INSERT INTO `t_menu` VALUES ('19', null, null, '00000000000', '客户资料', 'customer', null, '8', '0', '1', null);
INSERT INTO `t_menu` VALUES ('2', null, null, '00000000000', '首页', null, '&#xe601;', '1', '0', '0', '1');
INSERT INTO `t_menu` VALUES ('20', null, null, '00000000000', '销售计划', 'sale', null, '9', '0', '1', null);
INSERT INTO `t_menu` VALUES ('21', null, null, '00000000000', '应收账款', 'money', null, '10', '0', '1', null);
INSERT INTO `t_menu` VALUES ('22', null, null, '00000000000', '报表', 'report', null, '11', '0', '1', null);
INSERT INTO `t_menu` VALUES ('23', null, null, '00000000000', '查看菜单', 'menu', null, '5', '0', '1', null);
INSERT INTO `t_menu` VALUES ('24', null, null, '00000000000', '查看角色', 'role', null, '5', '0', '1', null);
INSERT INTO `t_menu` VALUES ('25', '2017-07-23 06:27:24', null, '00000000000', '客户公司', 'customerCom', null, '8', '0', '1', null);
INSERT INTO `t_menu` VALUES ('3', null, null, '00000000000', '个人信息', null, '&#xe61c;', '1', '0', '0', '2');
INSERT INTO `t_menu` VALUES ('4', null, null, '00000000000', '平台信息', null, '&#xe629;', '1', '0', '0', '3');
INSERT INTO `t_menu` VALUES ('5', null, null, '00000000000', '权限', null, '&#xe62d;', '1', '0', '0', '4');
INSERT INTO `t_menu` VALUES ('6', null, null, '00000000000', '合同信息', null, '&#xe63a;', '1', '0', '0', '5');
INSERT INTO `t_menu` VALUES ('7', null, null, '00000000000', '发票信息', null, '&#xe647;', '1', '0', '0', '6');
INSERT INTO `t_menu` VALUES ('8', null, null, '00000000000', '客户资料', null, '&#xe711;', '1', '0', '0', '7');
INSERT INTO `t_menu` VALUES ('9', null, null, '00000000000', '销售计划', null, '&#xe644;', '1', '0', '0', '8');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '角色名称',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源ID',
  `readOnly` varchar(255) DEFAULT '' COMMENT '1 可以修改 2不能删除和修改',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('0772a726751611e7891000163e066f16', '管理员', '2017-07-30 12:58:32', null, '00000000000', 'bd46bbc60ce0337d', '');
INSERT INTO `t_role` VALUES ('1', '管理员', '2017-07-09 11:29:49', null, '00000000000', '1', '2');
INSERT INTO `t_role` VALUES ('10', '管理员', '2017-07-23 12:06:44', null, '00000000000', 'f4ba890aa9451747', null);
INSERT INTO `t_role` VALUES ('11', '管理员', '2017-07-23 12:51:17', null, '00000000000', '26f0f847f9d21372', null);
INSERT INTO `t_role` VALUES ('1116c0d6747611e7891000163e066f16', '管理员', '2017-07-29 17:53:29', null, '00000000000', 'a8504fba24e2f2f7', '');
INSERT INTO `t_role` VALUES ('12', '销售', '2017-07-24 05:24:07', null, '00000000000', 'f4ba890aa9451747', null);
INSERT INTO `t_role` VALUES ('13', '出纳', '2017-07-24 05:32:36', null, '00000000000', 'f4ba890aa9451747', null);
INSERT INTO `t_role` VALUES ('17', '管理员', '2017-07-29 13:41:11', null, '00000000000', '9abe5cb8f71dc0e2', '');
INSERT INTO `t_role` VALUES ('2', '销售经理', '2017-07-09 12:14:09', null, '00000000000', '1', null);
INSERT INTO `t_role` VALUES ('2341e836753511e7a337c8d3ffe4d7bf', '管理员', '2017-07-30 16:41:14', null, '00000000000', 'c60d203a14db776b', '');
INSERT INTO `t_role` VALUES ('3', '销售助理', '2017-07-09 12:14:59', null, '00000000000', '1', null);
INSERT INTO `t_role` VALUES ('4', '销售部助经理', '2017-07-09 12:15:58', null, '00000000000', '1', null);
INSERT INTO `t_role` VALUES ('6', '管理员', '2017-07-14 09:51:27', null, '00000000000', 'f0da8668f77d8534eb08dfca0ed35d11', '2');
INSERT INTO `t_role` VALUES ('7', '出纳', '2017-07-14 17:40:46', null, '00000000000', 'f0da8668f77d8534eb08dfca0ed35d11', null);
INSERT INTO `t_role` VALUES ('9', '财务', '2017-07-16 05:48:19', null, '00000000000', '1', null);

-- ----------------------------
-- Table structure for t_sales_plan
-- ----------------------------
DROP TABLE IF EXISTS `t_sales_plan`;
CREATE TABLE `t_sales_plan` (
  `id` varchar(255) NOT NULL,
  `buyComId` varchar(11) NOT NULL DEFAULT '0' COMMENT '买方公司ID',
  `comContactsId` varchar(11) DEFAULT '0' COMMENT '买方公司联系人ID',
  `contractName` varchar(60) NOT NULL DEFAULT '' COMMENT '合同名称',
  `remarks` varchar(160) DEFAULT '' COMMENT '备注',
  `amt` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '计划签订金额',
  `userId` varchar(11) DEFAULT '0' COMMENT '添加计划员工ID',
  `comId` varchar(11) NOT NULL DEFAULT '0' COMMENT '所属公司',
  `signDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划签订时间',
  `state` int(11) NOT NULL DEFAULT '0',
  `createDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售计划';

-- ----------------------------
-- Records of t_sales_plan
-- ----------------------------
INSERT INTO `t_sales_plan` VALUES ('1', '0', '0', '系统安全检查', null, '10000.00', '0', '0', '2017-07-08 12:42:52', '0', '2017-07-24 08:00:59', null);
INSERT INTO `t_sales_plan` VALUES ('10', '25', '1', '系统安全检查2016', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 07:59:19', null);
INSERT INTO `t_sales_plan` VALUES ('11', '25', '1', '2017年度系统安全检查', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 08:04:04', null);
INSERT INTO `t_sales_plan` VALUES ('12', '25', '1', '2017年度系统安全检查', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 08:11:38', null);
INSERT INTO `t_sales_plan` VALUES ('13', '25', '16', '2017年度系统安全检查', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 08:13:30', null);
INSERT INTO `t_sales_plan` VALUES ('14', '25', '16', '2017年度系统安全检查', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 08:21:31', null);
INSERT INTO `t_sales_plan` VALUES ('15', '25', '22', '2017年度系统安全检查', null, '10000.00', '7', '12', '2017-07-07 18:00:00', '0', '2017-07-25 08:22:05', null);
INSERT INTO `t_sales_plan` VALUES ('16', '25', '23', '2017年度系统安全检查', null, '10000.00', '7', '0', '2017-07-07 18:00:00', '0', '2017-07-25 08:33:49', null);
INSERT INTO `t_sales_plan` VALUES ('2', '0', '0', '系统安全检查', null, '10000.00', '0', '0', '2017-07-07 18:00:00', '0', '2017-07-24 08:01:35', null);
INSERT INTO `t_sales_plan` VALUES ('3', '0', '0', '系统安全检查', null, '10000.00', '7', '0', '2017-07-07 18:00:00', '0', '2017-07-24 08:43:05', null);
INSERT INTO `t_sales_plan` VALUES ('4', '0', '1', '系统安全检查', null, '10000.00', '7', '25', '2017-07-07 18:00:00', '0', '2017-07-25 07:41:37', null);
INSERT INTO `t_sales_plan` VALUES ('5', '0', '1', '系统安全检查', null, '10000.00', '7', '25', '2017-07-07 18:00:00', '0', '2017-07-25 07:47:05', null);
INSERT INTO `t_sales_plan` VALUES ('6', '0', '1', '系统安全检查', null, '10000.00', '7', '25', '2017-07-07 18:00:00', '0', '2017-07-25 07:50:58', null);
INSERT INTO `t_sales_plan` VALUES ('7', '25', '1', '系统安全检查2016', null, '10000.00', '7', '0', '2017-07-07 18:00:00', '0', '2017-07-25 07:54:00', null);
INSERT INTO `t_sales_plan` VALUES ('8', '25', '1', '系统安全检查2016', null, '10000.00', '7', '0', '2017-07-07 18:00:00', '0', '2017-07-25 07:56:00', null);
INSERT INTO `t_sales_plan` VALUES ('9', '25', '1', '系统安全检查2016', null, '10000.00', '7', '0', '2017-07-07 18:00:00', '0', '2017-07-25 07:58:15', null);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(255) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) unsigned zerofill DEFAULT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `phoneNumber` varchar(255) DEFAULT '' COMMENT '联系电话',
  `mail` varchar(255) DEFAULT '' COMMENT '邮箱',
  `password` varchar(255) DEFAULT '' COMMENT '登录密码',
  `employeeNo` int(11) DEFAULT NULL COMMENT '员工编号',
  `currAddress` varchar(255) DEFAULT '' COMMENT '现住地址',
  `homeAdress` varchar(255) DEFAULT '' COMMENT '家庭住址',
  `birthday` varchar(255) DEFAULT '' COMMENT '出生日期',
  `idCardNo` int(11) DEFAULT NULL COMMENT '身份证号码',
  `applicationId` varchar(255) DEFAULT '' COMMENT '资源ID',
  `companyId` int(11) unsigned zerofill DEFAULT NULL COMMENT '公司ID',
  `readOnly` varchar(255) DEFAULT '' COMMENT '1 可以修改 2不能删除和修改 3不可查看',
  `leaderId` int(11) DEFAULT NULL COMMENT '领导id 作废',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('076be3be751611e7891000163e066f16', '2017-07-30 12:58:32', null, '00000000000', '管理员', '13870814641', '465716942@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, 'bd46bbc60ce0337d', null, '', null);
INSERT INTO `t_user` VALUES ('1', '2017-07-08 18:42:52', null, '00000000000', '管理员', '13870814617', '465716997@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, '1', '00000000001', '3', null);
INSERT INTO `t_user` VALUES ('10', '2017-07-21 10:55:36', null, '00000000000', null, '1111113', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000012', '1', null);
INSERT INTO `t_user` VALUES ('11', '2017-07-21 10:59:02', null, '00000000000', null, '1111114', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('11107a79747611e7891000163e066f16', '2017-07-29 17:53:29', null, '00000000000', '管理员', '13870814631', '465716932@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, 'a8504fba24e2f2f7', null, '', null);
INSERT INTO `t_user` VALUES ('12', '2017-07-21 11:00:37', null, '00000000000', null, '1111115', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('13', '2017-07-21 11:02:50', null, '00000000000', null, '1111116', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('14', '2017-07-21 11:25:45', null, '00000000000', null, '1111117', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('15', '2017-07-21 11:27:15', null, '00000000000', null, '1111118', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000009', '1', null);
INSERT INTO `t_user` VALUES ('16', '2017-07-23 12:06:40', null, '00000000000', '管理员', '13870814621', '465716982@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, 'f4ba890aa9451747', '00000000000', '3', null);
INSERT INTO `t_user` VALUES ('17', '2017-07-23 12:51:17', null, '00000000000', '管理员', '13870814612', '465716993@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, '26f0f847f9d21372', '00000000000', '3', null);
INSERT INTO `t_user` VALUES ('18', '2017-07-24 05:23:50', '2017-07-24 05:24:29', '00000000000', '销售', '13870814652', '465716999@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '2', null, null, null, null, 'f4ba890aa9451747', '00000000020', '1', null);
INSERT INTO `t_user` VALUES ('19', '2017-07-24 05:32:24', null, '00000000000', '出纳', '13870825411', '465716875@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '3', null, null, null, null, 'f4ba890aa9451747', '00000000020', '', null);
INSERT INTO `t_user` VALUES ('2', '2017-07-14 09:51:22', null, '00000000000', '管理员', '13870814613', '465716995@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, 'f0da8668f77d8534eb08dfca0ed35d11', '00000000003', '3', null);
INSERT INTO `t_user` VALUES ('233fe73f753511e7a337c8d3ffe4d7bf', '2017-07-30 16:41:14', null, '00000000000', '管理员', '13870814611', '465716992@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, 'c60d203a14db776b', null, '', null);
INSERT INTO `t_user` VALUES ('24', '2017-07-27 12:03:12', null, '00000000000', null, null, null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000000', '', null);
INSERT INTO `t_user` VALUES ('27', '2017-07-27 12:29:05', null, '00000000000', null, null, null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000017', '', null);
INSERT INTO `t_user` VALUES ('28', '2017-07-28 08:39:54', null, '00000000000', null, null, null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000017', '', null);
INSERT INTO `t_user` VALUES ('29', '2017-07-28 08:41:50', null, '00000000000', null, null, null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000017', '', null);
INSERT INTO `t_user` VALUES ('3', '2017-07-14 22:04:41', null, '00000000000', '张三1', '13870814622', '465716991@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, '1', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('30', '2017-07-28 08:43:53', null, '00000000000', null, null, null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000017', '', null);
INSERT INTO `t_user` VALUES ('34', '2017-07-29 13:41:11', null, '00000000000', '管理员', '13870814631', '465716932@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, '9abe5cb8f71dc0e2', null, '', null);
INSERT INTO `t_user` VALUES ('4', '2017-07-15 09:28:11', null, '00000000000', '张三2', '13870814616', '465716996@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '1', null, null, null, null, '1', '00000000001', '1', null);
INSERT INTO `t_user` VALUES ('6', '2017-07-15 11:46:56', null, '00000000000', '李四', '13870814614', '465716994@qq.com', 'bd2ae5c77d3c9109b5d6824131fdea88', '2', null, null, null, null, 'f0da8668f77d8534eb08dfca0ed35d11', '00000000003', '1', null);
INSERT INTO `t_user` VALUES ('7', '2017-07-20 04:33:39', null, '00000000000', null, '111111', null, 'd331c070e8713c6355d9ee10a2193df1', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000012', '1', null);
INSERT INTO `t_user` VALUES ('8', '2017-07-21 10:11:29', null, '00000000000', null, '1111111', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000012', '1', null);
INSERT INTO `t_user` VALUES ('9', '2017-07-21 10:54:18', null, '00000000000', null, '1111112', null, 'bd2ae5c77d3c9109b5d6824131fdea88', null, null, null, null, null, 'd3a1f90441cff9636152bf9935664515', '00000000012', '1', null);

-- ----------------------------
-- Function structure for $uuid
-- ----------------------------
DROP FUNCTION IF EXISTS `$uuid`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `$uuid`() RETURNS varchar(255) CHARSET utf8
BEGIN
	RETURN replace(UUID(),'-','');
END
;;
DELIMITER ;
