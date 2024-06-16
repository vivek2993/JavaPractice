package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * We have to find the duplicate elements and count of those duplicate elements
 */
public class FindDuplicateandCount {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3", "1", "4", "4");

		// this will give you the count of each element
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		Map<String, Long> collect = map.entrySet().stream().filter(value -> value.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		collect.forEach((key,value)->System.out.println(key+"   "+value));
	}
}
