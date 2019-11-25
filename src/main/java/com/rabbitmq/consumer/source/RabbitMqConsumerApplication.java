package com.rabbitmq.consumer.source;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqConsumerApplication.class, args);
	}
	
	/* Added to convert the generic type to Json format */

	 @Bean
	    public Jackson2JsonMessageConverter converter() {
	        return new Jackson2JsonMessageConverter();
	    }
}
