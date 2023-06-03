package com.example.awslambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwslambdaApplication {
	public String message() {
		return "hh";
	}


	public static void main(String[] args) {
		SpringApplication.run(AwslambdaApplication.class, args);
	}

}
