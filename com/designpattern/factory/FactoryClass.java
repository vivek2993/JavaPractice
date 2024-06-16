package com.designpattern.factory;

public class FactoryClass {

	
	public static Employee getEmployee(String empType) {
		
		if(empType.equalsIgnoreCase("WebDeveloper")) {
			return new WebDeveloper();
		}else if(empType.equalsIgnoreCase("JavaDeveloper")) {
			
			return new JavaDeveloper();
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		Employee employee = FactoryClass.getEmployee("WebDeveloper");
		
		System.out.println(employee.salary());
	}
	
	
	
}
