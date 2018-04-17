package com.privalia.aspectos;

public class Comprar implements Compra{
	
	public void compra(boolean error) throws Exception {
		if (error){
			throw new Exception("Algo ha salido mal...");
		}
		System.out.println("Realizando la compra...");
	}

}
