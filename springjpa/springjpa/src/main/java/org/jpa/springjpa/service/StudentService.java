package org.jpa.springjpa.service;

import java.util.List;
import java.util.Optional;

import org.jpa.springjpa.entity.Student;
import org.jpa.springjpa.repository.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private CustomRepository studentRepository;
//	@Autowired
//	private StudentMapper mapper;
	
	public List<Student> findAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> findStudent(Integer id) {
		return studentRepository.findById(id);
	}
	
	public List<Student> findStudentByName(String name) {
		return (List<Student>) studentRepository.findByName(name);
	}
	
	
}
