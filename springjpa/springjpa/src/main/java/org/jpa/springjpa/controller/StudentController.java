package org.jpa.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.jpa.springjpa.entity.Student;
import org.jpa.springjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/user")
public class StudentController {

		@Autowired
		private StudentService service;
		
		@GetMapping(value = "/getById")
		public ResponseEntity<String> getStudentById(ModelMap model,@RequestParam Integer id) {
			Optional<Student> st = service.findStudent(id);
			st.ifPresent(user -> System.out.println(user.toString()));
			model.put("message",st.get().toString());
			return ResponseEntity.ok(st.get().toString());
		}
		
		@GetMapping(value = "/getAll")
		public ResponseEntity<List<Student>> getStudentsList(ModelMap model) {
			List<Student> students = service.findAllStudents();
			model.put("message",students);
			return ResponseEntity.ok(students);
		}
		@GetMapping(value = "/getByName")
		public ResponseEntity<List<Student>> getStudentByName(@RequestParam String name){
			List<Student> students = (List<Student>) service.findStudentByName(name);
			return ResponseEntity.ok(students);
		}
}
