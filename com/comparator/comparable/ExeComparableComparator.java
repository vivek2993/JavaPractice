package com.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExeComparableComparator {

	public static void main(String[] args) {
		
		List<Employee> empl=new ArrayList<>();
		
		empl.add(new Employee(1,"Vivek",8000));
		empl.add(new Employee(5,"Abhished",4000));
		empl.add(new Employee(15,"Binod",9000));
		empl.add(new Employee(18,"priya",8000));
		empl.add(new Employee(7,"soni",8000));
		
		System.out.println("Sorting using Comparable");
		Collections.sort(empl);
		System.out.println(empl+"\n");
		
		System.out.println("Below is compared using comparator ::: By Name");
		Collections.sort(empl,new NameComparator()); 
		System.out.println(empl+"\n");
		
		System.out.println("Below is compared using comparator ::: By Id");
		Collections.sort(empl,new IdComparator());
		System.out.println(empl);
	}
}
