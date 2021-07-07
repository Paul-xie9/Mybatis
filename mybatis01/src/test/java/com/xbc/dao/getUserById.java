package com.xbc.dao;

import com.xbc.entity.User;
import com.xbc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class getUserById {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User userById = mapper.getUserById(2);
            System.out.println("id=2的用户是:"+userById);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
