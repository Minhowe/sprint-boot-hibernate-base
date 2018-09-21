package com.ipanda.dao;

import com.ipanda.domain.Student;

public interface StudentRepository {
    /**
     * 获取一个同学的信息
     * @return
     */
    Student getStudent();
}