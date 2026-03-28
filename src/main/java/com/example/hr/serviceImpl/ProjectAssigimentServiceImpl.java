package com.example.hr.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Project;
import com.example.hr.repository.EmployeeRepository;
import com.example.hr.repository.ProjectRepository;
import com.example.hr.service.ProjectAssigimentService;

@Service
public class ProjectAssigimentServiceImpl implements ProjectAssigimentService {
	
	@Autowired
	private  ProjectRepository projrepo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public Project addProject(Project pro)  throws Exception{
		
		if(pro.getRepo().contains("git"))
			return projrepo.save(pro) ;
		else
			throw new RuntimeException("Repo is not valid..");
	}


	@Override
	public Employee assign(int empIdid, int ProjectId) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp = empRepo.findById(empIdid);
	        Project proj = projrepo.findById(ProjectId);
	        emp.getProjects().add(proj);
        return empRepo.save(emp);
		
	}


	@Override
	public Employee unassign(int empIdid, int ProjectId) throws Exception{
		// TODO Auto-generated method stub
		Employee emp = empRepo.findById(empIdid);
		emp.getProjects().removeIf(p -> Objects.equals(p.getId(), ProjectId));
        return empRepo.save(emp);
	}
	
	 

}
