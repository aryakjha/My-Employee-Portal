package com.venture.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venture.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
		Employee findByemail(String email);
}
