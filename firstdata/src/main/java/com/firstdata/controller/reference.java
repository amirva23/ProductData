package com.firstdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reference {
 @GetMapping("/hey")
	public String login() {
	   return "Welcome page";
		// TODO Auto-generated constructor stub
	}

}
