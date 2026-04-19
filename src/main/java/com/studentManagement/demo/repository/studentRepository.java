package com.studentManagement.demo.repository;

import com.studentManagement.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends CrudRepository<Student, Long> {

}
