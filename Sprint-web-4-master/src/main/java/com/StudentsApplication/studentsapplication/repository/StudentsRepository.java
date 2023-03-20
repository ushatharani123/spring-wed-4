package com.StudentsApplication.studentsapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.StudentsApplication.studentsapplication.data.entity.Student;


public interface StudentsRepository extends CrudRepository<Student, Integer> {

}
