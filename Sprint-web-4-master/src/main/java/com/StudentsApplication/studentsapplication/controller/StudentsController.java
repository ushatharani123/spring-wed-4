package com.StudentsApplication.studentsapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentsApplication.studentsapplication.Services.StudentService;
import com.StudentsApplication.studentsapplication.data.entity.Student;



@RestController
public class StudentsController {
	@Autowired
	private StudentService studentService;

	public StudentsController(@Autowired StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/student")
	public Iterable<Student> getAllStudents() {
		return studentService.all();

	}
	@GetMapping("/{id}")
	public Student get(@PathVariable int id) {
		return studentService.get(id);
	}

	@PostMapping("/student")
	public void save(@RequestBody Student student) {
		studentService.save(student);
	}

	@PutMapping("/student")
	public void update(@RequestBody Student student) {
		studentService.update(student);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		studentService.delete(id);
	}
}
