package com.diwakar.service;

import org.springframework.stereotype.Service;

import com.diwakar.model.Employee;

@Service
public class EmployeeService  {

	public Employee checkEmployeeInfo() {
		Employee employee = new Employee();
		employee.setEmailId("test@gmail.com");
			employee.setNumber(123123123);
			employee.setUserName("Diwakar");
			employee.setUserPass("Diwakar");
		return employee;
	}
}
