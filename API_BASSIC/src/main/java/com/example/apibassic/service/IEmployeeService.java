package com.example.apibassic.service;

import java.util.List;
import java.util.Optional;

import com.example.apibassic.model.Employee;

public interface IEmployeeService {

	boolean deleteById(Long id);
	
	Employee update(long id, Employee employee);

	Optional<Employee> findById(Long id);

	List<Employee> findAll();

	Employee save(Employee entity);

	
	
}
