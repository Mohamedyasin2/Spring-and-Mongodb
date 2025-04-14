package com.example.Mongodb.Task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mongodb.Task.model.Employee;
import com.example.Mongodb.Task.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeerepo;
	
	
	Employee employee;
	
	public List<Employee> getAllEmployee() {
		
		return employeerepo.findAll();
	}

	
	public Employee addEmployee(String empId,String empName,String empEmail,String empLocation) {
		
		Employee employee = new Employee(empId,empName,empEmail,empLocation);
		return employeerepo.save(employee);
	}


	public Employee getEmployeeById(String empId) {
		
		return employeerepo.findById(empId).orElse(new Employee());// if there is no employee is existed it returns dummy details
		
	}

}
