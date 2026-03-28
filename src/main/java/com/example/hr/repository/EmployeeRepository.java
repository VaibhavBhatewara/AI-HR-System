package com.example.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.hr.entity.Employee;

import jakarta.persistence.Id;

public interface EmployeeRepository extends JpaRepository<Employee, Id>,JpaSpecificationExecutor<Employee> {

	Employee findById(int id);

}
