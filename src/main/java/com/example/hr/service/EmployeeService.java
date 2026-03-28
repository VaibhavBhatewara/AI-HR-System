package com.example.hr.service;

import java.util.List;

import com.example.hr.entity.Employee;
import com.example.hr.entity.Role;

public interface EmployeeService {
	
	Employee createEmployee( Employee emp) throws Exception;
	
    List<Employee> getEmployees(String name, Role role) throws Exception;// int projectId

    public Employee evaluate(int id, int score) throws Exception;
}
