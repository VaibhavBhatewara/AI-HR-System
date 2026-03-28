package com.example.hr.service;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Project;

public interface ProjectAssigimentService {
	
	Project addProject(Project pro) throws Exception; 
	
	Employee assign(int empIdid, int ProjectId) throws Exception;
	
	Employee unassign(int empIdid, int ProjectId) throws Exception;
	
	
}
