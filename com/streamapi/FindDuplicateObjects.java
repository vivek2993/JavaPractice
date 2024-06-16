	package com.streamapi;
	
	import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.stream.Collectors;
	
	/**
	 * In this we want to find out the duplicates object like whose id and name both are same
	 */
	public class FindDuplicateObjects {
	
		public static void main(String[] args) { 
			List<Employee> list = new ArrayList<>();
	
			   list.add(new Employee(2, "abhishek"));
		        list.add(new Employee(1, "vivek"));
		        list.add(new Employee(5, "xuo"));
		        list.add(new Employee(1, "vivek")); // Adding an employee with the same ID and name
		        list.add(new Employee(2, "abhishek")); // Adding another employee with the same ID and name
	
//		        List<Employee> duplicates = list.stream()
//		                .collect(Collectors.groupingBy(
//		                        e -> e,
//		                        Collectors.counting()))
//		                .entrySet().stream()
//		                .filter(entry -> entry.getValue() > 1)
//		                .map(Map.Entry::getKey)
//		                .collect(Collectors.toList());
	
		        Set<Employee> set =new HashSet<>();
		        
		        Map<Employee, Long> collect=     list.stream().filter(e-> !set.add(e)).collect(Collectors.groupingBy(e->e,Collectors.counting()));
	 
	        System.out.println(collect); 
		}
	}
