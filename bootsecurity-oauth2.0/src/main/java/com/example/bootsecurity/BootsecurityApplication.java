package com.example.bootsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class BootsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootsecurityApplication.class, args);
	}
// oauth uses other app like google to authenticate to new application
}
