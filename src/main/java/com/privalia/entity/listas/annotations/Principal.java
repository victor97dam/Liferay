package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan(Principal.class.getPackage().getName());
		context.refresh();
		
		Student student = (Student) context.getBean(Student.class);
		
		System.out.println(student.toString());
		
		context.close();
		
		
		

	}

}
