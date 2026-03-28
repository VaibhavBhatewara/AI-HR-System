package com.example.hr.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Role;
import com.example.hr.repository.EmployeeRepository;
import com.example.hr.repository.EmployeeSpecification;
import com.example.hr.service.EmployeeService;

import jakarta.persistence.Id;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee createEmployee(Employee emp) throws Exception{
		
		if(emp.getRole() == null)
			throw new RuntimeException("Employee Role Cannot be null..");
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getEmployees(String name, Role role) throws Exception{
		 if (name == null && role == null)
			 return empRepo.findAll();
		 
		return empRepo.findAll(EmployeeSpecification.filter(name,role));
	}
	
	public Employee evaluate(int id, int score) throws Exception {
        Employee emp = empRepo.findById(id);
        emp.setScore(score);
        return empRepo.save(emp);
    }
	

}
