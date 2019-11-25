/**
 * 
 */
package com.rabbitmq.consumer.source.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * @author Manoj Fernando A
 *
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Customer.class)
public class Customer {

	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId()				
				+ "]";
	}

	
}