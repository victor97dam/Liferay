package com.privalia.entity.listas;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student studentConstructor = (Student) context.getBean("studentConstructor2");
		
		System.out.println(studentConstructor.toString());
		
		context.close();

	}

}
