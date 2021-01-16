package com.abe.springboot.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abe.springboot.crud.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {

		Session currSession = entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery = currSession.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int id) {

		Session currSession = entityManager.unwrap(Session.class);
		
		Employee employee = currSession.get(Employee.class, id);
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		
		Session currSession = entityManager.unwrap(Session.class);
		
		currSession.saveOrUpdate(employee);
	}

	@Override
	public void deleteById(int id) {

		Session currSession = entityManager.unwrap(Session.class);
		
		Employee employee = findById(id);
		
		currSession.delete(employee);
	}

}
