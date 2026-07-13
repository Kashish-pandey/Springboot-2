package com.kashish.demo;

import com.kashish.demo.DependancyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student student= context.getBean(Student.class);
//		student.setName("Rahul");
//		student.setAge(30);
//
//		Student student = new Student(23, "Khushi");
//
//		System.out.println(student.getAge());
//		System.out.println(student.getName());
	OrderService orderService =  context.getBean(OrderService.class);
	orderService.placeOrder();

	}
}