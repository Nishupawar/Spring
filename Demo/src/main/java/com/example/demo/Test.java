package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("add")
	public int add() {
		int a=12;
		int b=13;
		int c=a+b;
		System.out.println("addition : "+c);
		return c;
	}
	
	@GetMapping("str")
	public String str()
	{
		return "abcd";
	}
	
}
