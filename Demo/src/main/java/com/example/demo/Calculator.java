package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Calculator {

	@PostMapping("mult")
	public int mult(@RequestParam int num1,@RequestParam int num2) {
		return num1+num2;
	}
	
	@GetMapping("add{num1}and{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2)
	{
		int result= num1+num2;
		return result;
	}

	@GetMapping("sub{num1}and{num2}")
	public int sub(@PathVariable int num1,@PathVariable int num2)
	{
		int result= num1-num2;
		return result;
	}

	@GetMapping("multi{num1}and{num2}")
	public int multi(@PathVariable int num1,@PathVariable int num2)
	{
		int result= num1*num2;
		return result;
	}
	@GetMapping("div{num1}and{num2}")
	public int div(@PathVariable int num1,@PathVariable int num2)
	{
		int result= num1/num2;
		return result;
	}
}
