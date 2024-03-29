package com.springbootdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Project started");
		Test t = context.getBean(Test.class);
		Person p = context.getBean(Person.class);
		t.setP(p);
		System.out.println(t.displayInfo());
	}

	@RequestMapping(value = "/")
	public String displayMessage() {
		return "Welcome to my page";
	}
}
