package com.example.graphQLDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class GraphQlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlDemoApplication.class, args);
	}

}
