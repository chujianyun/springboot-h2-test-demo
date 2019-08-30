SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`
(
    `id`   bigint(20)  NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL DEFAULT '',
    `age`  int(11)              DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `name_index` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
