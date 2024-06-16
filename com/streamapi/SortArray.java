package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArray {

	public static void main(String[] args) {
		int[] num= {5,10,15,35,28};
	
		sortinAscendingOrder(num);
		
		int[] num1= {5,10,15,35,28};
		sortinDescendingOrder(num1);
	}
	
	public static void sortinAscendingOrder(int[] num) {
		 
		 Arrays.stream(num).sorted().forEach(e->System.out.println(e));
	  
	}
	public static void sortinDescendingOrder(int[] num1) {
		   int[] array = {1, 4, 2, 7, 3, 9, 5};

	        // Sorting in descending order using Stream API
	      List<Integer> collect = Arrays.stream(array)
	                                  .boxed() // Convert int to Integer
	                                  .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	       System.out.println(collect);
	  
	}
}
