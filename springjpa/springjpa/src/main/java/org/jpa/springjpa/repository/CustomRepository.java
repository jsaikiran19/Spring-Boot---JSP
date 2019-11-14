package org.jpa.springjpa.repository;

import java.util.List;

import org.jpa.springjpa.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomRepository extends CrudRepository<Student, Integer>{
	
	//@Query("select student from Student")
	List<Student> findByName(String name);
	
} 
