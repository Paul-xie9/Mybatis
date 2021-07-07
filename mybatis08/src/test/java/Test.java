import com.xbc.bean.User;
import com.xbc.dao.UserMapper;
import com.xbc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Test {
    /**
     * 一级
     */
    @org.junit.Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
//        二级缓存
        SqlSession sqlSession1 = MybatisUtil.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User userById1 = mapper1.getUserById(1);
        System.out.println(userById1);
        sqlSession.close();
    }

    @org.junit.Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        int i = mapper.addUser(new User(9, "小明122", "12131341"));
        System.out.println(i>0? "ok":"false");
        User user1 = mapper.getUserById(1);
        System.out.println(user1);
        sqlSession.close();
    }

    @org.junit.Test
    public void getUserByNameTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("小");
        System.out.println(user);
        sqlSession.close();
    }
}
