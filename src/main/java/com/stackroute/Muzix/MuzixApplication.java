package com.stackroute.Muzix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.stackroute.Muzix.repository")
public class MuzixApplication
{
	public static void main(String[] args)

	{
		SpringApplication.run(MuzixApplication.class, args);
	}
}