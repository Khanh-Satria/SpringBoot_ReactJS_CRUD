package com.example.apibassic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apibassic.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
