package com.abe.springboot.crud.dao;

import java.util.List;

import com.abe.springboot.crud.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
}
