/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : localhost:3306
 Source Schema         : longhu-test

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : 65001

 Date: 30/11/2020 17:03:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '张三', '123456', '2020-11-01 15:56:16', '2020-11-01 15:56:34');
INSERT INTO `tb_user` VALUES (2, '李四', '123456', '2020-11-02 15:56:20', '2020-11-02 15:56:37');
INSERT INTO `tb_user` VALUES (3, '王五', '123456', '2020-11-03 15:56:23', '2020-11-03 15:56:40');
INSERT INTO `tb_user` VALUES (4, '赵六', '123456', '2020-11-04 15:56:27', '2020-11-04 15:56:45');
INSERT INTO `tb_user` VALUES (5, '陈七', '123456', '2020-11-05 15:56:30', '2020-11-05 15:56:51');

SET FOREIGN_KEY_CHECKS = 1;
