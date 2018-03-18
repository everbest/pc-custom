--连接控制台数据库
mysql -uroot -p
--创建数据库
CREATE DATABASE users;
--创建用户
CREATE USER 'cat'@'localhost' identified by '1234';
--授予mccree用户权限
GRANT ALL PRIVILEGES on users.* to 'cat'@'localhost' identified by '1234';
--退出root账号
exit
--使用mccree账号登陆
mysql -umccree -p
--使用数据库
use users;
--创建秒杀库存表
CREATE TABLE user(
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT `用户ID`,
  `username` VARCHAR(50) NOT NULL COMMENT `用户名`,
  `password` VARCHAR(50) NOT NULL COMMENT `密码`,
  `token` VARCHAR(64) NOT NULL COMMENT `标识验证`,
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT=`秒杀库存表`;


