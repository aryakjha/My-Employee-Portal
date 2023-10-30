package com.venture.demo.services;

import java.util.List;

import com.venture.demo.model.Employee;

public interface EmployeeService {
	boolean saveEmployee(Employee employee);
	
	List<Employee> getAlEmployee();
}
