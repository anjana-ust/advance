package com.example.rabbitmq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {
	
	/*
	 * public static final String Queue ="ust_queue"; public static final String
	 * Exchange ="ust_exchange"; public static final String
	 * Routing_key="ust_routingKey"; //commented and added in the application
	 * properties
	 */
	@Value("${ust.rabbitmq.queue}")
	public static final  String queueName="ust_queue";

	@Value("${ust.rabbitmq.exchange}")
	public static String exchange;

	@Value("${ust.rabbitmq.routingkey}")
	public static String routingkey;

	@Bean
	public Queue queue() {
		return new Queue(queueName);
	}

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(exchange);

	}

	@Bean
	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routingkey);
	}

	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}

	@Bean // bean is for java configuration
	public AmqpTemplate template(ConnectionFactory connectionFactory) // factory is called by bean and it is a design
																		// pattern
	{
		final RabbitTemplate template = new RabbitTemplate(connectionFactory);
		template.setMessageConverter(converter());
		return template;
	}

}
