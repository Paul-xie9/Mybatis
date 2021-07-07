package com.xbc.dao;

import com.xbc.entity.User;
import com.xbc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //2.执行sql语句
            //方法一
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        List<User> userList = userDao.getUserList();
            //方法二
            List<User> userList = sqlSession.selectList("com.xbc.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {

        } finally {
            //关闭
            sqlSession.close();
        }
    }
}
