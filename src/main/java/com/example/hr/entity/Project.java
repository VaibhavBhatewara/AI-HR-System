package com.example.hr.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Project {
	
	@Id
	@GeneratedValue
	private int id;

	
	@NotBlank
	private String name;
	
	@NotNull
	private String repo;
	

}
