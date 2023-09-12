package cgg.springdatajpa.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import cgg.springdatajpa.mapping.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	

}
