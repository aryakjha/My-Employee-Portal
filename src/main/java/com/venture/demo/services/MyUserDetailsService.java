package com.venture.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.venture.demo.dao.EmployeeRepository;
import com.venture.demo.model.Employee;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Employee emp = empRepository.findByemail(email);
		return new UserDetailsImpl(emp);
	}

}
