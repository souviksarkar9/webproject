package com.example.WebProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebProjectApplication.class, args);
	}
	
	@GetMapping("/")
	public String getString() {
		return "OK";
	}
}
