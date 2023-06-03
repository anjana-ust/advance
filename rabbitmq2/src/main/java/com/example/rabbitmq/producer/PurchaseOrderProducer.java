package com.example.rabbitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.model.OrderStatus;
import com.example.rabbitmq.model.PurchaseOrder;

@RestController
@RequestMapping("/order")
public class PurchaseOrderProducer {
	@Autowired // publisher has a dependency on template
	private RabbitTemplate template;
	
	

	
	@PostMapping("/{customerName}")
	public String bookOrder(@RequestBody PurchaseOrder order,@PathVariable String customerName) {
		order.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderStatus= new OrderStatus(order,"Accepted","order placed succesfully by "+ customerName);
		template.convertAndSend(MessagingConfig.exchange,MessagingConfig.routingkey,orderStatus);
		return "success"; // this is the confirmation to the sender of order
		
	}
}
