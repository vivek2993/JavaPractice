package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIForArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 1, 5, 8, 3, 5, 2 };
		findSecondLowestNumber(arr1);
		findSecondHighestNumber(arr1);

		findDuplicateElement(arr1);
		getCountOfCharacter();
		 
	}

	/**
	 * In this method we have to find 2nd lowest value.
	 * 
	 * To find the that value we have sorted the array and remove the first element
	 * from the array so that the 2nd lowest number will come in 1st position and
	 * findFirst will fetch that
	 * 
	 * @param arr1
	 */
	public static void findSecondLowestNumber(int[] arr1) {

		int findFirst = Arrays.stream(arr1).distinct().sorted().skip(1).findFirst().getAsInt();

		System.out.println("Second Lowest No. is " + findFirst);

	}

	public static void findSecondHighestNumber(int[] arr1) {

		Integer findFirst = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Highest no. is " + findFirst);

	}

	/**
	 * Find duplicates elements
	 */
	public static void findDuplicateElement(int[] arr1) {

		Set<Integer> set = new HashSet<>();

//		Arrays.stream(arr1).boxed().filter(num-> !set.add(num)).forEach(System.out::println);
		List<Integer> collect = Arrays.stream(arr1).boxed().filter(num -> !set.add(num)).distinct()
				.collect(Collectors.toList());

		System.out.println("Duplicate values are " + collect);
	}	

	/**
	 * Sort the String in ascending order and get the count of each character
	 */
	public static void getCountOfCharacter() {
		String data = "ilovejavacodingb";

		Map<String, Long> collect = Arrays.stream(data.split("")).sorted()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
	}
	
	 
}
