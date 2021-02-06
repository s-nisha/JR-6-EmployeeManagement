package com.empmgt.entities;

public class Department {
	private String departmentId;
	private String departmentName;
	public Department (String DepartmentId , String DepartmentName ) {
		this.departmentId=DepartmentId;
		this.departmentName=DepartmentName;
	}
	public String getDepartmentId(){
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId=departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName=departmentName;
	}
	

}
