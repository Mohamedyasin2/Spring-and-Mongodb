package com.example.Mongodb.Task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Mongodb.Task.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String>{

}
