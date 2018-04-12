package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan(Principal.class.getPackage().getName());
		context.refresh();
		
		Student student = (Student) context.getBean(Student.class);
		Address address = (Address) context.getBean(Address.class);
		
		System.out.println(student.toString());
		System.out.println(address.toString());
		
		context.close();
		
		
		

	}

}
