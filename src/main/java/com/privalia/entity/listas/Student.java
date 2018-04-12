package com.privalia.entity.listas;

import java.util.List;


public class Student {
	private int idStudent;
	private String name;
	private String surname;
	private int age;
	private List<Teacher> teacher;
	
	
	public Student(int idStudent, String name, String surname, int age, List<Teacher> teacher) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.teacher = teacher;
	}
	
	public Student(){
	
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=").append(idStudent).append(", name=").append(name).append(", surname=")
				.append(surname).append(", age=").append(age).append(", teacher=").append(teacher).append("]");
		return builder.toString();
	}

	// To resolve ${} in @Value
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev(){
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	
	
}


