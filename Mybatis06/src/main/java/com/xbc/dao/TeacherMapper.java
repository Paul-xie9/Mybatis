package com.xbc.dao;


import com.xbc.bean.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    //获取所有老师
    List<Teacher> getTeacher1();
    //获取老师信息下的所有学生信息
    Teacher getTeacher(@Param("tid") int id);

}
