package com.xbc.dao;

import com.xbc.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select *from teacher where tid = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
