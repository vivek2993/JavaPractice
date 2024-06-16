package com.stringprogram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * suppose there is a string aaabbcc then we need result as a3b2c2 print
 * character with no. of time it is present
 * 
 */
public class StringCompression {

	public static void main(String[] args) {

		String str = "aaabbcc";

		Map<Character, Integer> map = new LinkedHashMap();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Character, Integer> hl : map.entrySet()) {
			sb.append(hl.getKey());
			sb.append(hl.getValue());
		}
		System.out.println(sb.toString());
	}
}
