package com.example.hr.repository;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Role;

import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

public class EmployeeSpecification {
	
	public static Specification<Employee> filter(String name,Role role) //UUID projectId
	{
		  return (root, query, cb) -> {

	            List<Predicate> predicates = new ArrayList<>();

	            // Filter by name (partial match)
	            if (name != null && !name.isEmpty()) {
	                predicates.add(cb.like(
	                        cb.lower(root.get("name")),
	                        "%" + name.toLowerCase() + "%"
	                ));
	            }

	            // Filter by role
	            if (role != null) {
	                predicates.add(cb.equal(root.get("role"), role));
	            }

//	            // Filter by projectId (ManyToMany join)
//	            if (projectId != null) {
//	                Join<Object, Object> projects = root.join("projects");
//	                predicates.add(cb.equal(projects.get("id"), projectId));
//	            }

	            return cb.and(predicates.toArray(new Predicate[0]));
	        };
		
		
	}
}
