package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmpService {
	
	public Employee save(Employee emp);
	
	public List<Employee> findAll();
	
	public Employee findAById(long id);
	
	public long delete(long id);
	public Employee update(Employee emp);
	
	
}
