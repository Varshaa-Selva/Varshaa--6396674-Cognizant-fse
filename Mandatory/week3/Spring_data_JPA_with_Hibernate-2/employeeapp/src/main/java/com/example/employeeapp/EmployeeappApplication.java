package com.example.employeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import main.java.com.example.employeeapp.Employee;
import main.java.com.example.employeeapp.EmployeeService;

@SpringBootApplication
public class EmployeeappApplication {

	public static void main(String[] args) {
		// Let Spring Boot start the app and give us the context
		ApplicationContext context = SpringApplication.run(EmployeeappApplication.class, args);

		// Get the EmployeeService bean from the context
		EmployeeService employeeService = context.getBean(EmployeeService.class);

		// Create and save employees
		Employee e1 = new Employee("Varshaa", "CSE");
		Employee e2 = new Employee("Ajay", "ECE");

		employeeService.saveEmployee(e1);
		employeeService.saveEmployee(e2);

		System.out.println("Inserted successfully!!!!!");
	}
}
