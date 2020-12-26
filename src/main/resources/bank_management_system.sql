/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : bank_management_system

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 26/12/2020 20:42:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bankcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cktime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1是存款 2是取款',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES (1, '6216610200016587010', '张一', '50', '2020-12-24 14:02:18', '1');
INSERT INTO `money` VALUES (2, '6216610200016587010', '张一', '253', '2020-12-25 18:52:36', '1');
INSERT INTO `money` VALUES (3, '6216610200016587010', '张一', '600', '2020-12-25 18:55:52', '1');
INSERT INTO `money` VALUES (4, '6216610200016587010', '张一', '359', '2020-12-22 10:00:00', '2');
INSERT INTO `money` VALUES (5, '6216610200016587010', '张一', '200', '2020-12-24 17:13:11', '2');
INSERT INTO `money` VALUES (6, '6216610200016587011', '张二', '195', '2020-12-24 16:02:18', '1');
INSERT INTO `money` VALUES (7, '6216610200016587011', '张二', '256', '2020-12-25 20:52:36', '1');
INSERT INTO `money` VALUES (8, '6216610200016587011', '张二', '15', '2020-12-26 11:22:31', '1');
INSERT INTO `money` VALUES (9, '6216610200016587011', '张二', '600', '2020-12-26 23:01:05', '2');

-- ----------------------------
-- Table structure for role_function
-- ----------------------------
DROP TABLE IF EXISTS `role_function`;
CREATE TABLE `role_function`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `roleid` int(0) NULL DEFAULT NULL COMMENT '角色ID 1是管理员 2是用户',
  `function` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '功能',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_function
-- ----------------------------
INSERT INTO `role_function` VALUES (1, 1, '查询用户', NULL);
INSERT INTO `role_function` VALUES (2, 1, '修改用户', NULL);
INSERT INTO `role_function` VALUES (3, 1, '添加用户', NULL);
INSERT INTO `role_function` VALUES (4, 1, '删除用户', NULL);
INSERT INTO `role_function` VALUES (5, 2, '个人信息', NULL);
INSERT INTO `role_function` VALUES (6, 2, '转账记录', NULL);
INSERT INTO `role_function` VALUES (7, 2, '存款记录', NULL);
INSERT INTO `role_function` VALUES (8, 2, '取款记录', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `idcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `bankcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行卡号',
  `balance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '余额',
  `roleid` int(0) NULL DEFAULT NULL COMMENT '角色 1是管理员 2是用户',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'user1', 'pass1', '张一', 30, '110101199003075955', '6216610200016587010', '1500', 2);
INSERT INTO `user` VALUES (2, 'user2', 'pass2', '张二', 29, '	110101199103079032', '6216610200016587011', '3251', 2);
INSERT INTO `user` VALUES (3, 'user3', 'pass3', '张三', 28, '	110101199203077432', '6216610200016587012', '1589', 2);
INSERT INTO `user` VALUES (4, 'user4', 'pass4', '张四', 27, '	110101199303076878', '6216610200016587013', '5462', 2);
INSERT INTO `user` VALUES (5, 'user5', 'pass5', '张五', 26, '110101199403072973', '6216610200016587014', '265', 2);
INSERT INTO `user` VALUES (6, 'admin1', 'admin1', '管理员1', NULL, NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (7, 'admin2', 'admin2', '管理员2', NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for zhuanzhang
-- ----------------------------
DROP TABLE IF EXISTS `zhuanzhang`;
CREATE TABLE `zhuanzhang`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bankcarda` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bankcardb` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zhuanzhang
-- ----------------------------
INSERT INTO `zhuanzhang` VALUES (1, '6216610200016587010', '6216610200016587011', '200', '2020-12-21 14:02:18');
INSERT INTO `zhuanzhang` VALUES (2, '6216610200016587010', '6216610200016587012', '250', '2020-12-22 16:01:45');
INSERT INTO `zhuanzhang` VALUES (3, '6216610200016587010', '6216610200016587013', '100', '2020-12-23 08:22:51');
INSERT INTO `zhuanzhang` VALUES (4, '6216610200016587011', '6216610200016587012', '50', '2020-12-24 11:41:12');
INSERT INTO `zhuanzhang` VALUES (5, '6216610200016587011', '6216610200016587014', '150', '2020-12-24 12:01:57');
INSERT INTO `zhuanzhang` VALUES (6, '6216610200016587012', '6216610200016587012', '300', '2020-12-24 19:51:31');
INSERT INTO `zhuanzhang` VALUES (7, '6216610200016587013', '6216610200016587011', '75', '2020-12-25 14:34:23');
INSERT INTO `zhuanzhang` VALUES (8, '6216610200016587011', '6216610200016587013', '500', '2020-12-26 16:03:18');
INSERT INTO `zhuanzhang` VALUES (9, '6216610200016587014', '6216610200016587013', '250', '2020-12-27 22:12:45');

SET FOREIGN_KEY_CHECKS = 1;
