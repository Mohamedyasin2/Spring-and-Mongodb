package com.example.Mongodb.Task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mongodb.Task.model.Employee;
import com.example.Mongodb.Task.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	
	@GetMapping("/displayAll")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployee();
		
	}
	
	@GetMapping("/display/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") String empId) {
		return employeeservice.getEmployeeById(empId);
	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestParam("empId") String empId,
			@RequestParam("empName") String empName,
			@RequestParam("empEmail") String empEmail,
			@RequestParam("empLocation") String empLocation)
	{
		employeeservice.addEmployee(empId,empName,empEmail,empLocation);
		return "Successfully added the "+empName+"...";
	}

}
