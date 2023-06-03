package com.example.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Example1basicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Example1basicsApplication.class, args);
	}

}
