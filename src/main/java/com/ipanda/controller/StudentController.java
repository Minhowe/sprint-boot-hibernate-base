package com.ipanda.controller;

import com.ipanda.domain.Student;
import com.ipanda.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/Student")
public class StudentController {
    @Resource
    StudentService studentService;
    @RequestMapping(value = "/GetInfo")
    public Student getInfo() {
        return studentService.getStudent();
    }
}