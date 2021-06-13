package com.gonzalo.barbershop.infrastructure.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.gonzalo.barbershop.infrastructure")
@EnableJpaRepositories("com.gonzalo.barbershop.infrastructure.bbdd.repository")
@EntityScan(basePackages = "com.gonzalo.barbershop.infrastructure.bbdd.model")
public class BarbershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbershopApplication.class, args);
	}

}
