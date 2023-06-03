package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	@RabbitListener(queues = MessagingConfig.queueName)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue : "+orderStatus);
	}

}
