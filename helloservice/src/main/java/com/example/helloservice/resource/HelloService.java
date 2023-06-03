package com.example.helloservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloService {
	
	@Autowired
	Environment environment; //is a reference to properties
	
	@Value("name") //comes from properties file
	String strMessage;
	@GetMapping
	public String welcome() {
		String port=environment.getProperty("server.port");
		return "Programming Microservice @ "+port;
	}
	/*@GetMapping("/status")
	public String status() {
		return "Up and running";
		*/
	
	}


