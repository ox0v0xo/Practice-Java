# Project_Blog

> 博客项目笔记, 项目链接: [【实战】基于 SpringBoot+Vue 开发的前后端分离博客项目完整教学](https://www.bilibili.com/video/BV1PQ4y1P7hZ?p=1&vd_source=993f34d3199cf3caa93a059902697fd6)

## 配置

- 端口
  - 33010 : 项目
  - 33011 : mysql

## SQL

```shell
$ docker pull mysql
$ docker run -d --name mysql_blog -p 33011:3306 -e MYSQL_ROOT_PASSWORD=root mysql:latest

# 编辑 docker 中的 /etc/my.cnf
# [mysqld]
# default_time_zone='+8:00'
# 再重启容器, 改为北京时间
```
