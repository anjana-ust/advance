package com.example.conficserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConficserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConficserverApplication.class, args);
	}

}
//