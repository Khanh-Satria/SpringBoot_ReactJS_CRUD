package com.example.apibassic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apibassic.model.Employee;
import com.example.apibassic.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
public class HomeController {

	
	@Autowired
	IEmployeeService employeeService;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		
		return employeeService.save(employee);
	}
	
	
	@PutMapping("/update")
	public Employee update(Long id, Employee employee) {
		
		return employeeService.update(id, employee);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") long id) {
		
		return employeeService.deleteById(id);
	}
	
	
	@GetMapping("/list")
	public List<Employee> list(){
		return employeeService.findAll();
	}
}
