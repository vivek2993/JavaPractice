package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<List<Integer>> flat=new ArrayList<>();
		
		flat.add(Arrays.asList(1,2));
		flat.add(Arrays.asList(3,4));
		flat.add(Arrays.asList(5,6));
		flat.add(Arrays.asList(7,8));
		
		
		List<Integer> collect = flat.stream().flatMap(find->find.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
