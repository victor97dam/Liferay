package com.privalia.aspectos;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Compra cp = (Compra) context.getBean("compra");

		try {
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			
//			System.out.println("Invocamos para que se produzca un error");
//			cp.compra(true);
		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}
		
		context.close();
	}
}
