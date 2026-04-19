package com.studentManagement.demo.services;

import com.studentManagement.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentManagement.demo.repository.studentRepository;

import java.util.List;
import java.util.Objects;


@Service
public class studentServiceImpl implements studentService{

    @Autowired
    studentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public void deleteStudent (Long Id){
        studentRepository.deleteById(Id);
    }

    @Override
    public Student updateStudent(Student student, Long Id) {

        Student studentDB = studentRepository.findById(Id).get();

        if (Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())){
            studentDB.setStudentName(student.getStudentName());
        }

        if (Objects.nonNull(student.getStudentEmail()) && !"".equalsIgnoreCase(student.getStudentEmail())){
            studentDB.setStudentEmail(student.getStudentEmail());
        }

        if (Objects.nonNull(student.getStudentCourse()) && !"".equalsIgnoreCase(student.getStudentCourse())){
            studentDB.setStudentCourse(student.getStudentCourse());
        }

        return studentRepository.save(studentDB);
    }
}
