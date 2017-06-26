package com.buyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootOneApplication {

	@RequestMapping("/")
	String index(){
		return "Hello, Spring Boot! I am Zhu Xiaolong";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootOneApplication.class, args);
	}
}
