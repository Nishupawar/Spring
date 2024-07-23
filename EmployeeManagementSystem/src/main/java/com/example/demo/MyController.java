package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
@CrossOrigin
public class MyController {

	
	

		@Autowired
		EmployeeRepo employeeRepo;
		
		@Autowired
		UserRepo userRepo;
		@RequestMapping("delete{id}")
		public boolean delete(@PathVariable int id)
		{
			employeeRepo.deleteById(id);
			return true;
		}
		
		@RequestMapping("login{username}and{password}")
		public int login(@PathVariable String username, @PathVariable String password)
		{
			List<User> list = userRepo.findAll();
			for(User user:list)
			{
				if(user.getUsername().equals(username))
				{
					if(user.getPassword().equals(password))
					{
						return 1;
					}
					return 3;
				}
			}
			return 2;
		}
		
		@RequestMapping("add{id}and{name}and{department}and{payment}and{city}")
		public Employee add(@PathVariable int id,@PathVariable String name,@PathVariable String department,
				@PathVariable int payment,@PathVariable String city)
		{
			Employee employee = new Employee(id,name,department,payment,city);
			Employee save = employeeRepo.save(employee);
			return save;
		}
		
		@RequestMapping("read")
		public List<Employee> read()
		{
			return employeeRepo.findAll();
		}
}
