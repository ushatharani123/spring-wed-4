package com.StudentsApplication.studentsapplication.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsApplication.studentsapplication.data.entity.Student;
import com.StudentsApplication.studentsapplication.repository.StudentsRepository;

@Service
public class StudentServiceMYSQL implements StudentService {

	private StudentsRepository studentsRepository = null;
     
	
	@Autowired
	public StudentServiceMYSQL(StudentsRepository studentsRepository) {
		super();
		this.studentsRepository = studentsRepository;
	}

	@Override
	public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }

	@Override
	public Student get(int studentId) {
		Optional<Student> student = studentsRepository.findById(studentId);
		Student stud = null;
		if (student.isPresent()) {
			stud = student.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find student id :" + studentId);
		}
		return stud;

	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentsRepository.save(student);
	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		studentsRepository.deleteById(studentId);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentsRepository.save(student);
	}

}
