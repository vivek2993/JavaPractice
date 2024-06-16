package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In this class we have to find the 3rd highest id Employee 
 */
public class Find3rdHighestt {

	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"vivek");
		Employee e2=new Employee(2,"abhi");
		Employee e3=new Employee(3,"raju");
		Employee e4=new Employee(4,"pooja");
		Employee e5=new Employee(5,"kajal");
		Employee e6=new Employee(6,"shikha");
		
		Arrays.asList(e1,e2,e3,e4,e5,e6).stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);
		
	}
}
