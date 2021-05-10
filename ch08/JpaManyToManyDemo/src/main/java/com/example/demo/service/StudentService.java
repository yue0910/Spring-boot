package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudentList();
    public Student findStudentById(long id);
}
