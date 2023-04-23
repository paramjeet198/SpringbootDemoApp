package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/employees")
public class DemoController {

	private EmpService service;

	public DemoController(EmpService service) {
		this.service = service;
	}

	@GetMapping("/hello")
	String sayHello() {
		System.out.println("endpoint '/hello' hit successfull");
		return "Hello World!";
	}

	@PostMapping("")
	public Employee saveEmp(@RequestBody Employee emp) {
//		Employee emp= new Employee(0,"Param",50000);

		return service.save(emp);
	}

	@GetMapping("")
	public List<Employee> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Employee findById(@PathVariable long id) {
		return service.findAById(id);
	}

	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		service.delete(id);
	}

}
