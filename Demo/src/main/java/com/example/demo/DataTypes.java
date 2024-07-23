package com.example.demo;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTypes {

	@GetMapping("name")
	public String str()
	{
	 return "hello world";	
	}
	
	@GetMapping("byte")
	public byte byt()
	{
		return 1+1;
	}
	
	@GetMapping("int")
	public int add2()
	{
		return 1+3;
	}
	
	@GetMapping("short")
	public short add3()
	{
		return 1+8;
	}
	
	@GetMapping("float")
	public float add4()
	{
		return 1*2;
	}
	
	@GetMapping("long")
	public long add5()
	{
		return 51111+581;
	}
	
	@GetMapping("char")
	public char add7()
	{
		return 'v';
	}
	
	@GetMapping("double")
	public double dou()
	{
		return  43.23;
	}
	
	@GetMapping("bool")
	public boolean bool()
	{
		return true;
	}
	
	@GetMapping("add")
	public int add()
	{
		return 32+44;
	}
	
	@GetMapping("sub")
	public int sub()
	{
		return 327-44;
	}
	
	@GetMapping("mul")
	public int mul()
	{
		return 32*44;
	}
	
	@GetMapping("div")
	public int div()
	{
		return 200/5;
	}
	
	@GetMapping("mod")
	public int mod()
	{
		return 200%5;
	}

	@RequestMapping("helloLinkedListIntger")
	public  LinkedList<Integer> loginLinkedListInteger()
	{
		System.out.println("login ArrayList Integer ");
		LinkedList<Integer> list3= new LinkedList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		
		return list3 ;
	}	
	
}
