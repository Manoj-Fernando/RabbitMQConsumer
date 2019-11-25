/**
 * 
 */
package com.rabbitmq.consumer.source.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.consumer.source.model.Customer;

/**
 * @author Manoj Fernando A
 *
 */
@Component
public class RabbitMQService {
	


		@RabbitListener(queues = "${code.rabbitmq.queue}")
		public void recievedMessage(Customer customer) {
			System.out.println("Recieved Message From RabbitMQ: " + customer);
		}

}
