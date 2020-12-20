package com.employee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
