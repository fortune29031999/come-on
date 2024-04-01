package com.demorest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Demorest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demorest2Application.class, args);
	}
	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}

}
