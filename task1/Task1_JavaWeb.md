[TOC]

# JavaWeb

## Web网站的开发模式

![](.\assets\Web网站的开发模式.png)

## Maven

### 概述

* 用于管理和构建java项目的工具

* 依赖管理：管理项目依赖的资源(jar包)

* 统一项目结构：开发工具统一

  * 目录结构

    ![](.\assets\maven目录结构.png)



* 项目构建：标准跨平台的自动化项目构建方式

### maven坐标

![](.\assets\maven坐标.png)

### idea导入maven项目

![](.\assets\idea导入maven项目1.png)

![](.\assets\idea导入maven项目2.png)

## SpringBoot

### 概述

是Spring提供的一个子项目，用于快速构建Spring应用程序

### 入门程序运行截图

* springboot运行日志

  ![](.\assets\springboot运行日志.png)

* 本地浏览器访问截图

  ![](.\assets\本地浏览器访问截图.png)

## http协议

* 超文本传输协议，规定了浏览器和服务器之间数据传输的规则

* 特点

  ![](.\assets\http协议的特点.png)

* http请求数据格式

  * 基本格式

    ![](.\assets\http请求数据格式1.png)

  * 请求方式GET/POST

    ![](.\assets\http请求数据格式2.png)

  * 请求体

    ![](.\assets\http请求数据格式.png)

* 响应协议

  * 基本响应格式

    ![](.\assets\http基本响应格式.png)

  * 响应格式及返回

    ![](.\assets\http响应格式.png)

  * 常见响应状态码

    ![](.\assets\常见响应状态码.png)

* 协议解析

### http请求响应

#### 请求响应架构

![](.\assets\http请求响应.png)

#### postman

* 浏览器默认get请求,若要功能接口测试post请求，使用postman
* 网页调试与发送网页http请求

#### 响应

* 统一响应结果

![](C:\Users\25871\Desktop\焦糖工作室招新\6-刘锶宇\assets\http统一响应结果.png)



## tomcat(独立)

### web 服务器

是一个软件程序，对http协议的操作进行封装，让程序员不必直接对协议进行操作，让web开发更加便捷。主要功能是"提供网上信息浏览服务"。

### 使用

* 开启：bin\startup.bat

* 关闭：

  ![](.\assets\tomcat关闭startup.png)

* 端口号被占用(默认8080)

  * 关闭占用的java进程

  * 更改tomcat的端口号：conf/server.xml <Connector port="8080"......

    (http协议默认端口号为80，如果将tomct端口号改为80，则访问tomcat时将不用输入端口号)

* 访问tomcat:*localhost:8080*

* 将文件部署在tomcat上：将文件放置在webapp目录下

* 一般使用springboot内嵌tomcat

## mysql

* 储存和管理数据的仓库
* 数据库管理系统：操作和管理数据库的大型软件
* sql:操作关系型数据库的编程语言，定义了一套操作关系型数据库统一标准
* 数据模型：可以创建多个数据库(相互独立)存放不同类型的文件

### 运行截图

* mysql配置

  ![](.\assets\mysql配置1.png)

* mysql本地连接

  ![](.\assets\mysql本地连接.png)

* 云服务器上安装

  ![](.\assets\aliyun中mysql安装包下载.png)

* 设置开机启动服务

  ![](.\assets\mysql设置开机启动.png)

* 设置远程登陆

  ![](.\assets\mysql设置远程登陆.png)



### sql

* 一门操作关系型数据库的编程语言，定义操作所有关系型数据库的统一标准

* sql通用语法

  ![](.\assets\sql通用语法.png)

* sql分类

  ![](.\assets\sql分类.png)

### 数据库操作

![](.\assets\mysql数据库操作.png)



## mybatis

* 一款持久层(数据访问层)框架，用于简化jdbc的开发

## 实操

### oss

![](.\assets\oss1.png)

![](.\assets\oss2.png)

### 接口构建

#### 项目源码

[annnstar/some_things](https://github.com/annnstar/some_things)

#### 问题记录

**在maven中导入了oss java sdk 依赖，但不知道为什么会爆红找不到**

![](.\assets\项目.png)

**后面尝试了直接在项目中导入jar包，但是还是无法解决**

![](.\assets\接口构建.png)

**尝试了很久还是找不到问题出在哪里**

![](.\assets\try2.png)

## 源码

[jotang_task/task1 at main · annnstar/jotang_task](https://github.com/annnstar/jotang_task/tree/main/task1)

