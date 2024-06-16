package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * in this class we are sorting the students on the basis of department.
 */
public class SortByDepartment {

	
	public static void main(String[] args) {
		
		Department dept=new Department(1,"Application");
		Department dept1=new Department(2,"HR");
		Department dept2=new Department(3,"IT");
		Student s4=new Student("Abhished","New Delhi",dept);
		Student s1=new Student("Vivek","New Delhi",dept);
		Student s2=new Student("Ankur","UP",dept1);
		Student s3=new Student("Shikha","Lucknow",dept2);
		
		Stream<Student> listofstream = Stream.of(s1,s2,s3,s4);
		
		 Map<Department, List<Student>> collect = listofstream.collect(Collectors.groupingBy(e->e.getDepartment()));
		 
		 
		 collect.forEach((key,value)->System.out.println(key+" "+value));
		
	}
}
