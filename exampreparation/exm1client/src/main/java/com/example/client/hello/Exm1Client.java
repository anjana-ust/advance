package com.example.client.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("app/client")
public class Exm1Client {
	@Autowired
	RestTemplate template;
	
	@GetMapping("/call")
	public String callserver() {
		String url="http://localhost:9091/app/server";
		String output=template.getForObject(url, String.class);
		return output;
	}
	@GetMapping("/status")
	public ResponseEntity<String> checkStatus() {
		String url="http://localhost:9091/app/server";
		ResponseEntity<String> response =template.getForEntity(url, String.class);
		return response;
		 
		
	}

}
