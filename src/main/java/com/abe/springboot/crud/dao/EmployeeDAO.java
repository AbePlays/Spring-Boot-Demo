package com.abe.springboot.crud.dao;

import java.util.List;

import com.abe.springboot.crud.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
