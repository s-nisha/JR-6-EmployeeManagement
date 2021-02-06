package com.empmgt.entities;

public class Employee {
	private int id;
	private String name;
	private Department department;

	public Employee(int Id, String Name, Department Department) {
		this.id = Id;
		this.name = Name;
		this.department = Department;
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	public String setDepartment(String department) {
		return department;

	}

}
