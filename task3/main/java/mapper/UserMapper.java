package com.example.mybatis_example.mapper;

import com.example.mybatis_example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //在运行时，会自动生成接口的实现类对象（代理对象），并且将该对象交给IOC的spring容器管理
public interface UserMapper {
    //查询全部用户信息
    @Select("select * from user")//注解要执行的操作
    public List<User> findAllUser();
    public List<User> findUserByUserId(int userid);
}


