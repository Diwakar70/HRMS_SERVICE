package com.diwakar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diwakar.model.Employee;
import com.diwakar.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/empLogin")
	public Employee checkEmployeeInfo() {
		return empService.checkEmployeeInfo();
	}
	
}

