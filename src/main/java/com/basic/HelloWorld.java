package com.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basic.services.HelloWorldService;

public class HelloWorld {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldService service = (HelloWorldService)context.getBean("helloWorldServices");
		
		String message = service.sayHello();
		
		System.out.println(message);
		service.setName("Apple");
		System.out.println(service.sayHello());
	}

}
