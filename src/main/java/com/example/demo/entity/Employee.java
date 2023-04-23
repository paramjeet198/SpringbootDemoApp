package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "sallary")
	int sallary;

	
	
	public Employee() {

	}

	
	public Employee(long id, String empName, int sallary) {
		this.id = id;
		this.empName = empName;
		this.sallary = sallary;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public int getSallary() {
		return sallary;
	}




	public void setSallary(int sallary) {
		this.sallary = sallary;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", sallary=" + sallary + "]";
	}
	
	

}
