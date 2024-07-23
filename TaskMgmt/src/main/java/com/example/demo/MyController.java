package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@CrossOrigin
public class MyController {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	TaskRepo taskRepo;
	
	@RequestMapping("login{username}")
	public int login(@PathVariable String username,@RequestBody String password) {
		try {
			
			int count=userRepo.countByUsername(username);
			
			if(count==0) {
				return 0; //incorrect username				
			}
			else if(count==1){
			User us=userRepo.findByUsername(username);
			
			if(us.getPassword().equals(password)) {
				return 1;///login 
			}else {
				return 2;//wrong password 
			}
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;  //something error
		}
		return 0;
	}
	
	
	
	@RequestMapping("getone{username}")
	public User getone(@PathVariable String username) {
		User us=userRepo.findByUsername(username);
		return us;
	}
	
	@RequestMapping("add{id}")
	public Task add(@PathVariable int id, @RequestBody String dt) {
		System.out.println("add method");
		Task task = new Task(0,dt);
		Task taskdb=taskRepo.save(task);
		
		User us=userRepo.findById(id).get();
		us.getTask().add(taskdb);
		userRepo.save(us);
		System.out.println("task object "+taskdb);
		return taskdb;
	}
	
	@RequestMapping("delete{tid}and{uid}")
	@Transactional
	public boolean delete(@PathVariable int tid,@PathVariable int uid)
	{
		User user=userRepo.findById(uid).orElse(null);
		Task task=taskRepo.findById(tid).orElse(null);
		System.out.println("in delete");
		if(user!=null && task!=null && user.getTask().contains(task))
		{
			user.getTask().remove(task);
			userRepo.save(user); // save the user changes
			
			return true;
			
		}
		return false;
	}

}