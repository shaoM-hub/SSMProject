package org.lanqiao.service;

import org.lanqiao.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    List<Student> selectAllStudent();

    //增加学生信息
    int insertStudent(Student student);
    //删除学生信息
    int delStudent(Integer stuId);
    //更改学生信息
    int updateStudent(Student student);
    //获取学生信息总条数
    int getStuCount();
    //分页
    List<Student> getStuByPage(Map map);
}