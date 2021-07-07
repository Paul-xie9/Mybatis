package com.xbc.dao;

import com.xbc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select *from user")
    List<User> getUserList();


    //通过id查询用户
    @Select("select *from user where id = #{id}")
    List<User> getUserListById(@Param("id") int id);


    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
}
