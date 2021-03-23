package com.deusnex.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deusnex.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		
		// create a query
		Query theQuery = 
				entityManager.createQuery("FROM employee");
		
		// execute query and get results list
		List<Employee> employees = theQuery.getResultList();
		
		// return results
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
		return null;
	}

	@Override
	public void save(Employee theEmployee) {
		

	}

	@Override
	public void deleteById(int theId) {
		

	}

}
