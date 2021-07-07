package com.xbc.dao;

import com.xbc.entity.User;
import com.xbc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class addUserTest {
    @Test
    public void test() {
        //1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //2.执行sql语句
            //方法一
            //mybatis在执行DML时默认不开启提交事务，需要自己手动开启提交事务
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(4);
            user.setName("笑笑");
            user.setPassword("1234");
            int addUser = userDao.addUser(user);
            System.out.println(addUser > 0 ? "ok" : "false");
            sqlSession.commit();
        } catch (Exception e) {

        } finally {
            //关闭
            sqlSession.close();
        }
    }
}
