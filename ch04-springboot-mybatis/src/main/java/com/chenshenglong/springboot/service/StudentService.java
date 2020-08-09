package com.chenshenglong.springboot.service;

import com.chenshenglong.springboot.domain.Student;

public interface StudentService {

    Student selectStudent(Integer id);
    Integer updateStudent(Integer id,String name);
}
