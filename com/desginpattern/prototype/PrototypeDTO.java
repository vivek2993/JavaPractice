package com.desginpattern.prototype;

/*PROTOTYPE DESIGN PATTERN is used to copy and clone the object instead of creating the object from scratch
 * 
 * for this we will create a interface and have clone() in that after that we will implement that interface in those classes
 * 
 * */

public class PrototypeDTO implements Prototype {

	String id;
	String name;
	String address;


	public static void main(String[] args) {
		PrototypeDTO obj1=new PrototypeDTO("1", "vivek", "Delhi");
		
		System.out.println(obj1);
		PrototypeDTO obj2 =(PrototypeDTO) obj1.clone();
		
		System.out.println(obj2);
	}

	
	public PrototypeDTO(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Prototype clone() {
		return new PrototypeDTO(id, name, address);

	}

	@Override
	public String toString() {
		return "PrototypeDTO [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
