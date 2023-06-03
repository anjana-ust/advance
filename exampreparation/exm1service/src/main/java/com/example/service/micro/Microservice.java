package com.example.service.micro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Microservice {
	
	@GetMapping("/server")
	public String callserver() {
		return "service is running";
	}

}
