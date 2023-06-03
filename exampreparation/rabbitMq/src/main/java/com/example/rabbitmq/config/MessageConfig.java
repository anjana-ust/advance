package com.example.rabbitmq.config;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
	public static final String Queue="ust_queue";
	public static final String Exchange="ust_exchange";
	public static final String Routing_key="ust_key";
	
	@Bean
	public Queue queue() {
		return new Queue(Queue);
	}
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(Exchange);
		
	}
	@Bean
	public Binding Binding(Queue queue,TopicExchange exchange) {
		return  BindingBuilder.bind(queue).to(exchange).with(Routing_key);
	}
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}
	@Bean
	public AmqpTemplate template(ConnectionFactory connectionfactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionfactory);
		rabbitTemplate.setMessageConverter(converter());
		return rabbitTemplate;
		
	}
	
}
	
