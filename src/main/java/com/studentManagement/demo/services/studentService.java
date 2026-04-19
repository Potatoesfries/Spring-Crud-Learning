package com.studentManagement.demo.services;

import com.studentManagement.demo.entity.Student;

import java.util.List;

public interface studentService {

    Student saveStudent(Student student);

    List<Student> fetchAllStudents();

    Student updateStudent(Student student, Long Id);

    void deleteStudent(Long Id);
}
