package com.sportyShoes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.sportyShoes"})
public class SportyShoesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}

}
