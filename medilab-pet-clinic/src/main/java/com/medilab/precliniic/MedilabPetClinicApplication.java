package com.medilab.precliniic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MedilabPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabPetClinicApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(); 
	}

}
