package cgg.springdatajpa.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.springdatajpa.mapping.dto.Employee;
import cgg.springdatajpa.mapping.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepo;
	
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}

}
