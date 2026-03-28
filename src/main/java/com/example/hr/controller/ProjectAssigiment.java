package com.example.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Project;
import com.example.hr.service.ProjectAssigimentService;

@RestController
@RequestMapping("/assigiment")
public class ProjectAssigiment {
	
	@Autowired
	ProjectAssigimentService projtassigment;
	
	
	//Adding the New Repo 
	@PostMapping("/save")
	public Project addProject(@RequestBody Project pro) throws Exception {
		return projtassigment.addProject(pro);
	}
	
	
	//Providing the access to the repo
	 @PostMapping("/addAcess")
	    public Employee assign(@RequestParam int empId,
	                           @RequestParam int projId) throws Exception {

		 return projtassigment.assign(empId, projId);
		 
		 
	    }

	 
	 //Removing the access from the repo
	    @PutMapping("/removeAcess")
	    public Employee unassign(@RequestParam int empId,
	                             @RequestParam int projId) throws Exception {
	    	
	    	return projtassigment.unassign(empId, projId);
	    	
									

	    }
	
	
	
	
	
	

}
