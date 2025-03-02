package com.streamapi;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find1stNonRepeatChar {

	public static void main(String[] args) {

		String str = "hello";

		firstRepeatChar(str);
		firstNonRepeatChar(str); 
		traditionalWay(str);
	}

	private static void firstRepeatChar(String str) {

		LinkedHashMap<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

		Character character = map.entrySet().stream().filter(val -> val.getValue() > 1).map(key -> key.getKey())
				.findFirst().get();

		System.out.println("First Repeating char is ->" + character);
	}

	private static void firstNonRepeatChar(String str) {

		LinkedHashMap<Character, Long> map = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

		Character character = map.entrySet().stream().filter(val -> val.getValue() == 1).map(e -> e.getKey())
				.findFirst().get();
		System.out.println("First Non repeating char is -> " + character);
	}

	// Traditional way to solve the issue :::::::::::
	private static void traditionalWay(String str) {
		HashSet<Object> hashSet = new HashSet<>();

		// finding the 1st repeating character
		for (char ch : str.toCharArray()) {

			if (hashSet.contains(ch)) {
				System.out.println("1st repeated character ::::::::: " + ch);
			}
			hashSet.add(ch);
		}
	}

}
