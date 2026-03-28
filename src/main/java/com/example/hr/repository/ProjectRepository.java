package com.example.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hr.entity.Project;

import jakarta.persistence.Id;

public interface ProjectRepository extends JpaRepository<Project, Id> {

	Project findById(int projectId);

}
