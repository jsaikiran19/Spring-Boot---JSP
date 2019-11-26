package org.jpa.springjpa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.jpa.springjpa.entity.Student;

@Mapper
public interface StudentMapper {
	
	void insert(Student student);
	Student getById(int id);
	List<Student> getByName(String name);

}
