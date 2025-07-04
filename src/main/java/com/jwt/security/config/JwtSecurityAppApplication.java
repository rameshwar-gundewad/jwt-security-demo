package com.jwt.security.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jwt.security.*")
public class JwtSecurityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityAppApplication.class, args);
	}

}
