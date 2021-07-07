package com.xbc.dao;

import com.xbc.entity.User;
import com.xbc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

public class Test {

    static Logger logger = Logger.getLogger(Test.class);

    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void log4jTest(){
        logger.info("info:进入log4j");
        logger.debug("debug:进入log4j");
        logger.error("error:进入log4j");

    }

    @org.junit.Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startPage",0);
        map.put("pageSize",2);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
