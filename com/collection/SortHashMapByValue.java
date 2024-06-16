package com.collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("John", 25);
		unsortedMap.put("Alice", 30);
		unsortedMap.put("Bob", 20);
		unsortedMap.put("Eve", 35);

		sortbyvalue(unsortedMap);

		System.out.println("===========================================");

		sortbyKey(unsortedMap);
	}

	/**
	 * Sort the map on the basis of there values
	 */
	public static void sortbyvalue(Map<String, Integer> unsortedMap) {

		Map<String, Integer> map = new TreeMap<>(Comparator.comparing(unsortedMap::get));

		map.putAll(unsortedMap);

		map.forEach((key, value) -> System.out.println(key + "  " + value));
	}

	/**
	 * Sort the map on the basis of there Key
	 */
	public static void sortbyKey(Map<String, Integer> unsortedMap) {

		Map<String, Integer> map = new TreeMap<>(unsortedMap);

		map.putAll(unsortedMap);

		map.forEach((key, value) -> System.out.println(key + "  " + value));
	}
}
