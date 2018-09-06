/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 06/09/2018 20:15:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `datetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `date` date DEFAULT NULL,
  `decimal` decimal(10,0) DEFAULT NULL,
  `time` time DEFAULT NULL,
  `year` year(4) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (2, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (3, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (4, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (5, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (6, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (7, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (8, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (9, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (10, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (11, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (12, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (13, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (14, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (15, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (16, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (17, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (18, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (19, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (20, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (21, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (22, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (23, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (24, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (25, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (26, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (27, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (28, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (29, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (30, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (31, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (32, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (33, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (34, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (35, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (36, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (37, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (38, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (39, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
INSERT INTO `t_user` VALUES (40, '7player', 18, '123456', '2018-09-06 18:43:52', NULL, NULL, NULL, NULL, NULL, '1111111');
COMMIT;

-- ----------------------------
-- Table structure for who
-- ----------------------------
DROP TABLE IF EXISTS `who`;
CREATE TABLE `who` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `datetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `date` date DEFAULT NULL,
  `decimal` decimal(10,0) DEFAULT NULL,
  `time` time DEFAULT NULL,
  `year` year(4) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of who
-- ----------------------------
BEGIN;
INSERT INTO `who` VALUES (1, '7player', 18, '123456', NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
