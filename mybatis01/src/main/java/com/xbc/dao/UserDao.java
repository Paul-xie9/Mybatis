package com.xbc.dao;

import com.xbc.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();

    public int addUser(User user);
    public User getUserById(int id);
    public int updateUser(User user);
    //万能map
    public int updateUser2(Map<String,Object> map);

    //模糊查询
    List<User> getUserListByname(String name);
}
