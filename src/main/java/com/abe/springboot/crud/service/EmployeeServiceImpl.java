package com.abe.springboot.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.abe.springboot.crud.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeService theEmployeeService;

	@Override
	@Transactional
	public List<Employee> findAll() {
		return theEmployeeService.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return theEmployeeService.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		theEmployeeService.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		theEmployeeService.deleteById(id);
	}

}
