package com.comparator.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
	
//	To do comparision for the string
//	@Override
//	public int compareTo(Employee other) {
//		return this.name.compareTo(other.name); // Compare based on name
//	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
