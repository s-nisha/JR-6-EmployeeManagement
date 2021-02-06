package com.empmgt.entities;

public class Tester extends Employee {
 private String tools;
 public Tester(int Id, String Name, Department Department, String Tools) {
		super(Id, Name, Department);
		this.tools = Tools;
 }
 public String getTools() {
	 return tools;
 }
 public String setTools(String tools) {
	 return tools;
 }
}