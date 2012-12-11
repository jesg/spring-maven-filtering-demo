package com.gowan;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("dev")
public class DogDevConfig {

	@Resource private Environment environment;
	@Bean
	public Dog fred() {
		return new Dog("yip", environment.getProperty("spring.profile"));
	}
}
