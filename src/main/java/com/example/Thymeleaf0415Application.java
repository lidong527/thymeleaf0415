package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mapper")
@SpringBootApplication
public class Thymeleaf0415Application {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf0415Application.class, args);
	}

}
