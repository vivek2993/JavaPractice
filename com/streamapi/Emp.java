package com.streamapi;

public class Emp{

//	id,name,age ,salary
//	
//	list -sort by salary and remove duplicate id
	
	private int id;
	private String name;
	private int age;
	private double salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
//	@Override
//	public int compareTo(Emp o) {
//   
//		if(o.salary.c this.salary)
//			return 1;
//		else if(0.salary >this.salary)
//			return -1;
//		else
//		return 0;
//	}
//	
	
}
