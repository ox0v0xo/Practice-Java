-- 创建用户表
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `username` char(64) NOT NULL,
    `password` varchar(255) NOT NULL,
    `avatar` varchar(255) DEFAULT NULL,
    `email` char(64) DEFAULT NULL,
    `status` tinyint(4) NOT NULL,
    `created` datetime DEFAULT CURRENT_TIMESTAMP,
    `last_login` datetime DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_USERNAME` (`username`) USING BTREE
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;
-- 创建博客表
DROP TABLE IF EXISTS `m_blog`;
CREATE TABLE `m_blog` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id` bigint(20) NOT NULL,
    `title` varchar(255) NOT NULL,
    `description` varchar(255) NOT NULL,
    `content` longtext,
    `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `status` tinyint(4) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `idx_user_id` (`user_id`),
    CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `m_user` (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 11 DEFAULT CHARSET = utf8mb4;
-- 插入用户数据
-- 密码 wi 111111
START TRANSACTION;
INSERT INTO `m_user` (
        `id`,
        `username`,
        `password`,
        `avatar`,
        `email`,
        `status`,
        `created`,
        `last_login`
    )
VALUES (
        1,
        'iw',
        '993560a792e622201090d67041f7882e',
        'https://avatars.githubusercontent.com/u/178242985?v=4',
        NULL,
        0,
        CURRENT_TIMESTAMP,
        NULL
    ),
    (
        2,
        'markerhub',
        '96e79218965eb72c92a549dd5a330112',
        'https://image-1300566513.cos.ap-guangzhou.myqcloud.com/upload/images/5a9f48118166308daba8b6da7e466aab.jpg',
        NULL,
        0,
        CURRENT_TIMESTAMP,
        NULL
    );
COMMIT;