package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepo extends JpaRepository<User, Integer> {

	   int countByUsername(String username);
	   User findByUsername(String username);
}
