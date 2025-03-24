package com.example.gridSettings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GridSettingsApplication {

	@GetMapping
	public  String message(){ return "Hello World"; }

	public static void main(String[] args) {
		SpringApplication.run(GridSettingsApplication.class, args);
	}

}
