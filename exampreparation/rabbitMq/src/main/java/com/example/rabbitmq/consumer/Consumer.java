package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmq.config.MessageConfig;
import com.example.rabbitmq.model.Status;

@Component
public class Consumer {
	@RabbitListener(queues=MessageConfig.Queue)
	public void consumeMessageFromQueue(Status Status)
	{
		System.out.println("Message received from queue: "+Status);
	}

}
