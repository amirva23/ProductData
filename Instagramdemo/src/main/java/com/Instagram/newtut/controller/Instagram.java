package com.Instagram.newtut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Instagram {
		@GetMapping("/getpost")
		public String getPost(@RequestParam String username)
		{
			return "HI this i me "+username;
			
		// TODO Auto-generated constructor stub
	}

}
