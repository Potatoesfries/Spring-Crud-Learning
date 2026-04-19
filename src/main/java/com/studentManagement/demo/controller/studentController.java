package com.studentManagement.demo.controller;

import com.studentManagement.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.studentManagement.demo.services.studentService;

import java.util.List;
@RestController
public class studentController {
    @Autowired
    private studentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@Validated @RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/student")
    public List<Student> fetchAllStudent(){
        return studentService.fetchAllStudents();
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long Id){
        return studentService.updateStudent(student, Id);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long Id){
        studentService.deleteStudent(Id);
        return "Student deleted successfully";
    }
}
