package com.xbc.dao;

import com.xbc.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询学生相关信息
    List<User> getUserIf(Map map);

    //查询学生信息
    List<User> getUserChoose(Map map);

    //更新用户
    int updateUserSet(Map map);

    //查询id 1 2 3的用户
    List<User> getUserForeach(Map map);
}
