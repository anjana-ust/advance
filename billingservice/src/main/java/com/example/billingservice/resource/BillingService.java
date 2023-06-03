package com.example.billingservice.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rest/billing")
public class BillingService {
	@Value("name")
	String strMessage;
	@GetMapping
	public String callbilling() {
	return "from billing "+ strMessage;
}
}
