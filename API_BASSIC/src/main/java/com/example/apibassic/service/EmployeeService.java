package com.example.apibassic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apibassic.model.Employee;
import com.example.apibassic.repository.EmployeeRepository;


@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public boolean deleteById(Long id) {
		if(id >= 1) {
			Employee employee = employeeRepository.findById(id).get();
			if(employee != null) {
				employeeRepository.deleteById(id);
				return true;
			}
		}
		 
		return false;
	}

	@Override
	public Employee update(long id, Employee employee) {
		if(employee != null) {
			Employee employeeTemp = employeeRepository.findById(id).get();
			if(employeeTemp != null) {
				employeeTemp.setName(employee.getName());
				employeeTemp.setAddress(employee.getAddress());
				return employeeRepository.save(employeeTemp);
			}
		}
		
		return null;
	}

	
	
	
}
