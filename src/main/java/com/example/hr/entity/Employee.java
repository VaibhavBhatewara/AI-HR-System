package com.example.hr.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@Data
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NonNull
	private String name;
	
	@NotNull
	@Email(message = "Email is not valid")
	private String email;
	
	private char gender;
	
	private String team;
	
	@Enumerated(EnumType.STRING)
    private Role role;
	
	
	private Date birthdate;
	
	private String position;
	
	private Date recruitmentDtae;
	
	private Integer score;
	
	 @ManyToMany
	    private List<Project> projects = new ArrayList<>();
	

}
