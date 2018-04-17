package com.privalia.aspectos.annotations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan(Principal.class.getPackage().getName());
		context.refresh();

		Compra cp = (Compra) context.getBean(Compra.class);

		try {
			System.out.println("Invocamos sin problemas");
			
			cp.compra(true);
			
//			System.out.println("Invocamos para que se produzca un error");
//			cp.compra(true);
		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}
		
		context.close();
	}
}
