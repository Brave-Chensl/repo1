package com.chenshenglong.springboot.service.Impl;

import com.chenshenglong.springboot.domain.Student;
import com.chenshenglong.springboot.mapper.StudentMapper;
import com.chenshenglong.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
   private StudentMapper dao;
    @Override
    public Student selectStudent(Integer id) {
      Student student =  dao.selectByPrimaryKey(id);
            return student;
    }

    @Override
    @Transactional
    public Integer updateStudent(Integer id, String name) {
        Student student = new Student();
        student.setId(id);
       student.setName(name);
        int i = dao.updateByPrimaryKeySelective(student);
       int o = 10/0;
        return i;
    }


}
