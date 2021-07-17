package com.idat.minimarket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class MinimarketApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimarketApiSpringApplication.class, args);
	}

}
