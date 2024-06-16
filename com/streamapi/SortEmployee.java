package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(2, "abhishek"));
		list.add(new Employee(1, "vivek"));
		list.add(new Employee(5, "xuo"));

		System.out.println("Sort by ID====================================");

		sortbyId(list);
		System.out.println();
		System.out.println("Sort by Name====================================");
		sortbyName(list);
		System.out.println();
		List<Employee> list1 = new ArrayList<>();

		list1.add(new Employee(2, "abhishek"));
		list1.add(new Employee(1, "vivek"));
		list1.add(new Employee(1, "anjulika"));

		System.out.println("Sort by Id if Id is same then sort on name========");
		sortbyIDThenName(list1);
	}

	public static void sortbyId(List<Employee> list) {

		// 1st way
//		list.stream().sorted((e1,e2)-> Integer.compare(e1.getId(), e2.getId())).forEach(e->System.out.println(e));;

		// 2nd way
		list.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(e -> System.out.println(e));
	}

	public static void sortbyName(List<Employee> list) {

//		list.stream().sorted((e1,e2)-> e1.getName().compareTo(e2.getName())).forEach(e->System.out.println(e));;
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e -> System.out.println(e));

	}

	/**
	 * sort the Employee on the basis of id if the employee is having the same id
	 * then compare it on the basis of name
	 * 
	 * @param list
	 */
	public static void sortbyIDThenName(List<Employee> list) {

		list.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName))
				.forEach(e -> System.out.println(e));

	}
}
