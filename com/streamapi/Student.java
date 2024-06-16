package com.streamapi;

public class Student {

	private String name;
	private String address;
	
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name, String address, Department department) {
		super();
		this.name = name;
		this.address = address;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", department=" + department + "]";
	}
 
	
}
