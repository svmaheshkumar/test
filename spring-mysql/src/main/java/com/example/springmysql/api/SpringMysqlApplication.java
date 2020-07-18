package com.example.springmysql.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.springmysql.api.dao.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =UserRepository.class)
public class SpringMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}

}
