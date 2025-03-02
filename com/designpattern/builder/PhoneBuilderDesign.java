package com.designpattern.builder;

/*
 * The Builder Pattern is a creational design pattern that allows us to create complex objects step by step. 
Instead of having a large constructor with many parameters, 
the Builder Pattern separates object construction from its representation, making it more readable and flexible.
	
*/
public class PhoneBuilderDesign {
	private final String brand;
	private final String processor;
	private final String os;
	private final String ram;

	// Private constructor
	private PhoneBuilderDesign(PhoneBuilder builder) {
		this.brand = builder.brand;
		this.processor = builder.processor;
		this.os = builder.os;
		this.ram = builder.ram;
	}

	// Builder Class (Static Inner Class)
	public static class PhoneBuilder {
		private String brand;
		private String processor;
		private String os;
		private String ram;

		public PhoneBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public PhoneBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public PhoneBuilder setOs(String os) {
			this.os = os;
			return this;
		}

		public PhoneBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}

		public PhoneBuilderDesign build() { // Build method to create the final Phone object
			return new PhoneBuilderDesign(this);
		}
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", processor=" + processor + ", os=" + os + ", ram=" + ram + "]";
	}

	public static void main(String[] args) {
		// Using Builder Pattern
		PhoneBuilderDesign phone = new PhoneBuilderDesign.PhoneBuilder().setBrand("Vivo").setProcessor("Snapdragon 888")
				.setOs("Android").setRam("8GB").build();

		System.out.println(phone);
	}
}
