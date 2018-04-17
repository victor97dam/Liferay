package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
	
	
	private String hello;

	public String getHello() {
		return hello;
	}


	public HelloWorld() {
		
	}

	public HelloWorld(String hello) {
		
		this.hello = hello;
	}
	
	@Autowired
	@Value("Hello World From constructor")
	public void setHello(String hello) {
		this.hello = hello;
	}


}
