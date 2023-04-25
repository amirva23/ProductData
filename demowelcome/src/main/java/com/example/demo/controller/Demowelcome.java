package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demowelcome {
	@GetMapping("/hey")
	public String Welcome() {
		return "Welcome to Springboot tutorial";
	}
	
	
	

}
           