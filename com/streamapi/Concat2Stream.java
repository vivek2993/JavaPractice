package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2Stream {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		List<String> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

		System.out.println(collect);
	}
}
