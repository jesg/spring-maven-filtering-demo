package com.gowan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@ImportResource("classpath:META-INF/beans.xml")
@Configuration
@PropertySource("classpath:dog.properties")
public class DogConfig {

	@Autowired private Environment environment;
	
	@Bean
	public Dog dog() {
		return new Dog("ruff", environment.getProperty("dog.name"));
	}
	@Bean
	public DogService dogService() {
		return new DogService(dog());
	}
	
}
