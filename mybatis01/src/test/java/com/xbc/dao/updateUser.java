package com.xbc.dao;

import com.xbc.entity.User;
import com.xbc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class updateUser {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(4);
            user.setName("晓晓");
            user.setPassword("32321");
            int i = mapper.updateUser(user);
            System.out.println(i>0? "ok":"false");
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            Map<String,Object> map = new HashMap<>();
            map.put("id",5);
            map.put("name",5);
            map.put("password",5);
            int i = mapper.updateUser2(map);
            System.out.println(i>0? "ok":"false");
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
