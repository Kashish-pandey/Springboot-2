package com.kashish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setStudent("Khushi", 101);

		System.out.println("Name: " + s1.getName());
		System.out.println("Roll No: " + s1.getRoll());


		SpringApplication.run(DemoApplication.class, args);
	}

}
