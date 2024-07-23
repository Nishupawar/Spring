package com.example.demo;

	import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;

	@Entity
	public class User {

		 @Id
		  @GeneratedValue (strategy = GenerationType.IDENTITY)
		int id;
		String name;
		String username;
		String password;
		@OneToMany (cascade = CascadeType.ALL)
	     List<Task> task;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String name, String username, String password, List<Task> task) {
			super();
			this.id = id;
			this.name = name;
			this.username = username;
			this.password = password;
			this.task = task;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<Task> getTask() {
			return task;
		}
		public void setTask(List<Task> task) {
			this.task = task;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", task="
					+ task + "]";
		}
		
		
		
	}

