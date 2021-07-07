
import com.xbc.bean.User;
import com.xbc.dao.UserMapper;
import com.xbc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void getUserIfTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap map = new HashMap();
        map.put("name","小");
        map.put("tid",2);
        List<User> user = mapper.getUserIf(map);
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void getUserChooseTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("tid",1);
       // hashMap.put("name","小秘密2");
        List<User> userChoose = mapper.getUserChoose(hashMap);
        for (User user : userChoose) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void updateUserSetTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("name","test_name");
        hashMap.put("id",1);
mapper.updateUserSet(hashMap);
//        System.out.println(i>0? "ok":"false");
        sqlSession.close();
    }

    @org.junit.Test
    public void getUserForeachTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        hashMap.put("list",integers);
        List<User> userForeach = mapper.getUserForeach(hashMap);
        for (User foreach : userForeach) {
            System.out.println(foreach);
        }
        sqlSession.close();
    }
}
