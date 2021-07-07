package com.xbc.dao;

import com.xbc.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//根据id查询用户
    User getUserById(@Param("id") int id);

    User getUserByName(@Param("name") String name);
    //添加用户
    int addUser(User user);
}
