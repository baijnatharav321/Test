package com.mindtree.empproducerrest.entity;

public class Employee {
	private String empId;
	private String name;
	private String designations;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String empId, String name, String designations, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.designations = designations;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignations() {
		return designations;
	}
	public void setDesignations(String designations) {
		this.designations = designations;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
