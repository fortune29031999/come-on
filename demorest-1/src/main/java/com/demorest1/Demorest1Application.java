package com.demorest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Demorest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demorest1Application.class, args);
		
	}
	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}

}
