package com.shiva187.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ben";
	}
	
	@Bean
	public int age() {
		return 33;
	}
	
	@Bean
	public Person person() {
		return new Person("Gabby", 20, new Address("Main ST", "Miami"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
		return new Person(name, age, address3);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("5008 Vauxhall Ct", "Richmond");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("22 st", "Cali");
	}
	
}
