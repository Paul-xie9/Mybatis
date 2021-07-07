package com.xbc.dao;

import com.xbc.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();

    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
}
