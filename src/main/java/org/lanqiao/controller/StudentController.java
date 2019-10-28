package org.lanqiao.controller;

import org.lanqiao.bean.Page;
import org.lanqiao.bean.Student;
import org.lanqiao.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/students")
public class StudentController {
     @Autowired
     //按类型自动注入学生业务类
     IStudentService studentService;

    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public ModelAndView getPage(Integer currpage){
        ModelAndView modelAndView = new ModelAndView("");
        Integer page = currpage;
        System.out.println(page);
        return modelAndView;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ModelAndView selectAllstu(Integer currents){
        //创建modelAndView对象
        ModelAndView modelAndView = new ModelAndView("showStu");
        //分页查询
        //声明当前页
        int currentPage = 0;
        //声明每页显示的条数
        int pageSize = 5;
        //查询数据总条数
        int count = studentService.getStuCount();
        //创建page对象
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setTotalCount(count);
        //获取当前页参数
        Integer current = currents;
        if (current==null){
            currentPage = 1;
        }else{
            currentPage = current;
        }
        //判断当前页，不能大于总页数，不能小于第一页
        if(currentPage<1){
            currentPage = 1;
        }
        if (currentPage>page.getTotalCount()){
            currentPage = page.getTotalPage();
        }
        Map map = new HashMap<>();
        map.put("start",(currentPage-1)*pageSize);
        map.put("lines",pageSize);
        //获取学生信息
        List<Student> stuList = studentService.getStuByPage(map);
        //把学生信息 放入request作用域
        modelAndView.addObject("stuList",stuList);
        //把当前页的信息放入request作用域
        modelAndView.addObject("currentPage",currentPage);
        page.setCurrentPage(currentPage);
        modelAndView.addObject("page",page);
        return modelAndView;
    }
    @RequestMapping(value = "/insertStudent",method = RequestMethod.POST)
    public String insertStudent(Student student){
        studentService.insertStudent(student);
        return "redirect:/students/all";
    }
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    public String del(Integer stuId){
        studentService.delStudent(stuId);
        return "forward:/students/all";
    }
    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public String updateStudent(Student student){
        int result = studentService.updateStudent(student);
//        ModelAndView modelAndView = new ModelAndView("showStu");
//        if (result>0){
//            List<Student> studentlist = studentService.selectAllStudent();
//            modelAndView.addObject("stuList",studentlist);
//        }
        return "redirect:/students/all";
    }

}
