package com.privalia.calculatorexample.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.util.Assert;

import com.privalia.calculatorexample.Calculator;
import com.privalia.calculatorexample.ICalculator;

public class CalculatorTest {
	
	//Polimorfismo de interfaces  Persona p = new Empleado();
	ICalculator icalculator = new Calculator();

	@Test
	public void sumaTest() {
		Assert.isTrue(icalculator.add(2, 2) == 4);
	}

	@Test
	public void restaTest() {
		Assert.isTrue(icalculator.substract(2, 2) == 0);
	}
	
	@Test
	public void multiplicacionTest() {
		Assert.isTrue(icalculator.multiply(2, 2) == 4);
	}
	
	
	@Test
	public void divisionTest() {
		Assert.isTrue(icalculator.divide(2, 2) == 1);
	}
}
