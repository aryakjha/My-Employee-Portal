package com.venture.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venture.demo.model.Employee;
import com.venture.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
		if(employeeService.saveEmployee(emp)) {
			return new ResponseEntity<>("Data Saved !! " , HttpStatus.OK);
		}
		
		return new ResponseEntity<>("Data Not Saved!!" , HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAlEmployee();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Employee emp) {
		return "Login Successful!!";
	}
}



