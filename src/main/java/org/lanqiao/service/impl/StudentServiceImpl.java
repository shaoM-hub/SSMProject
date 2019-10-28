package org.lanqiao.service.impl;

import org.lanqiao.bean.Student;
import org.lanqiao.dao.IStudentDao;
import org.lanqiao.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service      //把该业务类注册到spring里
public class StudentServiceImpl implements IStudentService {

    //根据类型自动注入studentDao对象
    @Autowired
    IStudentDao studentDao;
    @Override
    public List<Student> selectAllStudent() {
        return studentDao.selectAllStudent();
    }

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int delStudent(Integer stuId) {
        return studentDao.delStudent(stuId);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int getStuCount() {
        return studentDao.getStuCount();
    }

    @Override
    public List<Student> getStuByPage(Map map) {
        return studentDao.getStuByPage(map);
    }

}
