--连接控制台数据库
mysql -uroot -p
--创建数据库
CREATE DATABASE pc;
--创建用户cat
CREATE USER 'cat'@'localhost' identified by '1234';
--授予cat用户权限
GRANT ALL PRIVILEGES on pc.* to 'cat'@'localhost' identified by '1234';
--退出root账号
exit
--使用cat账号登陆
mysql -ucat -p
--使用数据库
use pc;
--创建user存表
CREATE TABLE user(
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(50) NOT NULL COMMENT '密码',
  `token` VARCHAR(64) NOT NULL DEFAULT '11112222333344445555666677778888' COMMENT '标识验证',
  `create_time` TIMESTAMP NOT NULL DEFAULT '1990-03-01 00:00:00' COMMENT 'register time',
  `token_time` TIMESTAMP NOT NULL DEFAULT '1990-03-01 00:00:00' COMMENT 'last login to generate token time',
  PRIMARY KEY(user_id),
  KEY idx_token(token),
  KEY idx_create_time(create_time),
  KEY idx_token_time(token_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='users table';

--insert data into table user
INSERT INTO
  user(username,password,create_time)
VALUES
  ('sjj','skysky','2017-03-27 10:00:00'),
  ('tc','skysky','2018-01-02 12:25:00'),
  ('mccree','bootboot','2018-03-25 16:00:00'),
  ('dog','bootboot','2017-01-01 00:00:01');