package com.basic.services;

import org.springframework.stereotype.Service;

@Service("helloWorldServices")
public class HelloWorldService {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello " + this.name;
	}
}
