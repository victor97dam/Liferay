package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.privalia.aspectos.annotations")


public class Comprar implements Compra{
	
	public void compra(boolean error) throws Exception {
		if (error){
			throw new Exception("Algo ha salido mal...");
		}
		System.out.println("Realizando la compra...");
	}

}
