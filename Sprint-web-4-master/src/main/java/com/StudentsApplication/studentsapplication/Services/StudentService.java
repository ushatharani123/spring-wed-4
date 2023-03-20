package com.StudentsApplication.studentsapplication.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.StudentsApplication.studentsapplication.data.entity.Student;


@Service
public interface StudentService {
	
    Iterable<Student> all();

    Student get( int studentId );

    void save( Student student );

    void delete( int studentId );

	void update(Student student);
}
