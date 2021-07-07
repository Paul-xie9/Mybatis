import com.xbc.bean.Teacher;
import com.xbc.dao.TeacherMapper;
import com.xbc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    @org.junit.Test
    public void getTeacherTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher1();
        for (Teacher t : teacher) {
            System.out.println(t);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
