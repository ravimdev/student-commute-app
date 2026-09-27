package com.ravimdev.StudentCommuteApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Equal to 3 tags Configuration, EnableAutoconfiguration, ComponentScan

public class StudentCommuteAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCommuteAppApplication.class, args);
	}

}
