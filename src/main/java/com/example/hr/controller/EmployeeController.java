package com.example.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Role;
import com.example.hr.serviceImpl.EmployeeServiceImpl;

import jakarta.annotation.PostConstruct;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empService;
	
	@PostConstruct
	public void init() {
	    System.out.println("EmployeeController Loaded..");
	}
	
	//Create The New Employee
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee emp) throws Exception {
		return empService.createEmployee(emp);
	}
	
	
	//Get The Employee By Name And Role.. If Not Sent Anything Get all Employee.
	@GetMapping("/getEmployee")	
	public List<Employee> getEmployee(@RequestParam (required =false)String  name, @RequestParam (required =false)Role role) throws Exception{
		return empService.getEmployees(name, role) ;
		
	}
	
	//
	@PutMapping("/{id}/score")
    public Employee evaluate(@PathVariable int id,
                             @RequestParam int score) throws Exception {
        return empService.evaluate(id, score);
    }
	
	
	

}
