
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
