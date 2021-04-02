package com.casestudy.caseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.caseStudy.entityModels.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
	
}
