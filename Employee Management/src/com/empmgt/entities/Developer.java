package com.empmgt.entities;

public class Developer extends Employee {
	private String language;

	public Developer(int Id, String Name, Department Department, String Language) {
		super(Id, Name, Department);
		this.language = Language;
	}

	public String getLanguage() {
		return language;
	}

	public String setLanguage(String language) {
		return language;
	}
}
