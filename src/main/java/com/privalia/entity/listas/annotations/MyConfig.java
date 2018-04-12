package com.privalia.entity.listas.annotations;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean(value = "student")
	public Student student(){
		Student student = new Student();
		student.setName("Pepe");
		student.setSurname("de los palotes");
		student.setAge(16);
		student.setIdStudent(1);
		student.setTeacher(teachers());
		return student;
	}


	@Bean(value = "teachers")
	public List<Teacher> teachers(){
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher(1,"Ticher1"));
		teachers.add(new Teacher(2,"TicherDos"));
		return teachers;
	}

}