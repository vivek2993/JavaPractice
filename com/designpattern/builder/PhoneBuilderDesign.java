package com.designpattern.builder;

public class PhoneBuilderDesign {

	private String brand;
	private String processor;
	private String os;
	private String ram;

	public PhoneBuilderDesign setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public PhoneBuilderDesign setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilderDesign setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilderDesign setRam(String ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public String toString() {
		return "PhoneBuilderDesign [brand=" + brand + ", processor=" + processor + ", os=" + os + ", ram=" + ram + "]";
	}

	
	public static void main(String[] args) {
		PhoneBuilderDesign builder=new PhoneBuilderDesign();
		PhoneBuilderDesign setOs = builder.setBrand("Vivo").setOs("Android");
		
		System.out.println(setOs);
		
		
	}
}
