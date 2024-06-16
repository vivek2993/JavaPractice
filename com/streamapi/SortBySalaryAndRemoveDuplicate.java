package com.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Sort the Emp by salary and remove the duplicate value
 */
public class SortBySalaryAndRemoveDuplicate {

	public static void main(String[] args) {

		Stream<Emp> stream = Stream.of(new Emp(2, "vivek", 25, 10000), new Emp(1, "priya", 25, 2000),
				new Emp(1, "abhi", 25, 2000), new Emp(5, "rahul", 25, 850000));
		
		HashSet<Integer> set=new HashSet<>();
		
		
		List<Emp> collect = stream.sorted((a,b)-> Double.compare(a.getSalary(), b.getSalary())).filter(e->set.add(e.getId())).collect(Collectors.toList());

		collect.forEach(e->System.out.print(e));
	}
}
