package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {

	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	TaskRepo taskRepo;
	
	public int login(@PathVariable String username,@RequestBody String password) {
		
		
		return 1;
	}
}
