package com.chenshenglong.springboot.controller;
import com.chenshenglong.springboot.domain.Student;
import com.chenshenglong.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
   private StudentService service;

    @RequestMapping("/s")
    public @ResponseBody Object find(Integer id){

        Student student = service.selectStudent(id);

        return student;
    }

    @RequestMapping("/update")
    public @ResponseBody int updateStudent(Integer id,String name){
       int i = service.updateStudent(id,name);
        return i;
    }

}
