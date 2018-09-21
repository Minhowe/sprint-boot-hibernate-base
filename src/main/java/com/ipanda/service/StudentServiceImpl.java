package com.ipanda.service;

import com.ipanda.dao.StudentRepository;
import com.ipanda.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    /**
     *
     * @return
     */
    @Override
    @Transactional
    public Student getStudent() {
        return studentRepository.getStudent();
    }
}
