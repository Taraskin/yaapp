package com.example.yaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import com.example.yaapp.entity.ResourceRepository;

@SpringBootApplication
@EnableJdbcRepositories(basePackageClasses = {ResourceRepository.class})
public class YaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(YaappApplication.class, args);
	}

}
