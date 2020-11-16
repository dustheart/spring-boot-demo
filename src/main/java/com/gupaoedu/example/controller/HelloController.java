package com.gupaoedu.example.controller;

import com.gupaoedu.example.dao.entity.User;
import com.gupaoedu.example.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${hello}")
	private String name;

	@Autowired
	IUserService userService;

	@GetMapping
	public String test(){
		User user = new User();
		user.setName(name);
		userService.insert(user);
		return "Hello Spring Boot " + name;
	}

}
