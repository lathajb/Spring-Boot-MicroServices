package com.example.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		System.out.println("From Item service");
		SpringApplication.run(ItemServiceApplication.class, args);
	}
}
