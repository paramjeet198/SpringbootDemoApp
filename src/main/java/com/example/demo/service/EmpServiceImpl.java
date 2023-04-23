package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpDao;
import com.example.demo.entity.Employee;

@Service
public class EmpServiceImpl implements EmpService{

	private EmpDao dao;
	
	public EmpServiceImpl(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public Employee save(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		return dao.findAll();
	}

	@Override
	public Employee findAById(long id) {
		Optional<Employee> optional =  dao.findById(id);
		if(!optional.isPresent()){
			System.out.println("No Employee Found with id: " + id);
		}
		
		return optional.get();
	}

	@Override
	public long delete(long id) {
		Employee emp = findAById(id);
		dao.delete(emp);
		return id;
	}

	@Override
	public Employee update(Employee emp) {
		return dao.save(emp);
	}

}
