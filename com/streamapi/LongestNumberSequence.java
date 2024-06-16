package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class LongestNumberSequence {
	   public static void main(String[] args) {
	        String str = "132asd112345as";
	        
	        String[] split = str.split("\\D+");
	        
	        System.out.println(Arrays.asList(split));
	        String longestNumberSequence = Arrays.stream(str.split("\\D+")) // Split by non-digit characters
	                                             .filter(s -> !s.isEmpty()) // Filter out empty strings
	                                             .max(Comparator.comparingInt(e->e.length())) // Find the longest string
	                                             .orElse("integer value nahi hai"); // Handle case where no numbers are found
	        
	        System.out.println("Longest number sequence: " + longestNumberSequence);
	    }
}
