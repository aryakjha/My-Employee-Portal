package com.venture.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venture.demo.dao.EmployeeRepository;
import com.venture.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public boolean saveEmployee(Employee employee) {
		
		Employee e = employeeRepository.save(employee);
		
		if(e != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<Employee> getAlEmployee() {
		
		return employeeRepository.findAll();
	}
		
}
