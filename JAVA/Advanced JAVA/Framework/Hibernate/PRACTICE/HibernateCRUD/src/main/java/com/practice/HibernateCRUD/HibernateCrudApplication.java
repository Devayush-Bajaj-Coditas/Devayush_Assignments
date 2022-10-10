package com.practice.HibernateCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCrudApplication.class, args);
	}

}
