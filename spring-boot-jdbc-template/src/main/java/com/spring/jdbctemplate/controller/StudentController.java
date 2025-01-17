package com.spring.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbctemplate.model.Student;
import com.spring.jdbctemplate.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping("/student")
	public int addStudent(@RequestBody Student student) {
		return studentRepository.addStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return studentRepository.getStudentById(id);
	}

	@PutMapping("/student")
	public int updateStudent(@RequestBody Student student) {
		return studentRepository.updateStudent(student);
	}

	@DeleteMapping("/student/{id}")
	public int deleteStudentById(@PathVariable("id") int id) {
		return studentRepository.deleteStudentById(id);
	}
}
