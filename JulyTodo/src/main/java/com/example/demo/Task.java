package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class Task {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String detsils;
	String isDeleted;
}
