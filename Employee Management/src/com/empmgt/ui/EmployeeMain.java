package com.empmgt.ui;

import com.empmgt.entities.*;

	public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeMain app = new EmployeeMain();
		app.start();
	}
		public void start() {
			Employee employees[] = new Employee[4];
			Department department1 = new Department("1A","Development");
			Department department2 = new Department("2A","Development");
			Department department3 = new Department("1B","Testing");
			Department department4 = new Department("2B","Testing");
			
			Developer employee1 = new Developer (01, "Abhi", department1, "java" );
			Developer employee2 = new Developer (02, "Aviral", department2, "C++" );
			Tester employee3 = new Tester (03, "Nivi", department3, "Squish" );
			Tester employee4 = new Tester(04,"Nivas",department4,"Testim");
			
			employees[0]=employee1;
			employees[1]=employee2;
			employees[2]=employee3;
			employees[3]=employee4;
			
			for(int i=0; i<employees.length;i++) {
				Employee emp =employees[i];
				
				if(emp instanceof Developer) {
					Developer DeveloperEmployee = (Developer)emp;
					displayEmployee(DeveloperEmployee);
				}
				if(emp instanceof Tester) {
					Tester TesterEmployee=(Tester)emp;
					displayEmployee(TesterEmployee);
				}
			}
			
		}
		 void displayPrimaryEmployee(Employee employee) {
		
		 int getid = employee.getId();
		 String name = employee.getName();
		 Department department = employee.getDepartment();
		 String departmentId = department.getDepartmentId();
		 String departmentName=department.getDepartmentName();
		 System.out.println("Employee Id: "+getid);
		 System.out.println("Employee Name: "+name);
		 System.out.println("Department : ");
		 System.out.println("Dept. Id: "+ departmentId + " Dept.Name: "+ departmentName);
		 
		 }
		 void displayEmployee(Developer employee) {
			 displayPrimaryEmployee(employee);
			 String language=employee.getLanguage();
			 System.out.println("language: "+language);
		 }
		 void displayEmployee(Tester employee) {
			 displayPrimaryEmployee(employee);
			 String tool=employee.getTools();
			 System.out.println("Testing tools: "+tool);
			 }
		 }
	
		 
