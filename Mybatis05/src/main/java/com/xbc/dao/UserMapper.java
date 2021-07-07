package com.xbc.dao;

import com.xbc.bean.User;

import java.util.List;

public interface UserMapper {
    //查询所有学生信息，以及对应的老师
    List<User> getUserList();
}
