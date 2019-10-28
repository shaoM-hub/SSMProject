package org.lanqiao.dao;

import org.lanqiao.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
    List<Student> selectAllStudent();

    //添加学生信息
    int insertStudent(Student student);
    //删除学生信息
    int delStudent(Integer stuId);
    //更改学生信息
    int updateStudent(Student student);

    //查询学生总条数
    int getStuCount();
    //分页展示
    List<Student> getStuByPage(Map map);

}
