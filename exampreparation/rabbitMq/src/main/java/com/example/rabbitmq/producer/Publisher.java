package com.example.rabbitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.config.MessageConfig;
import com.example.rabbitmq.model.Order;
import com.example.rabbitmq.model.Status;

@RestController
@RequestMapping("/order")
public class Publisher {
@Autowired
RabbitTemplate template;

@PostMapping("/{Restname}")
public String bookOrder(@RequestBody Order order,@PathVariable String Restname) {
	order.setOrderid(UUID.randomUUID().toString());
	Status status=new Status(order,"Success","order placed in");
	template.convertAndSend(MessageConfig.Exchange, MessageConfig.Routing_key,status);
	return "Success";
	
}
}

