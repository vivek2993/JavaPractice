package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	 public static void main(String[] args) {
	        String input = "aaabbcddddeeeeee";
	        System.out.println(encode(input));
	        
	        usingStream(input);
	    }

	    private static void usingStream(String input) {

 
	}

		public static String encode(String input) {
	        if (input == null || input.length() == 0) {
	            return "";
	        }

	        StringBuilder encodedString = new StringBuilder();
	        int count = 1;
	        char currentChar = input.charAt(0);

	        for (int i = 1; i < input.length(); i++) {
	            char nextChar = input.charAt(i);
	            if (nextChar == currentChar) {
	                count++;
	            } else {
	                encodedString.append(currentChar);
	                if (count > 1) {
	                    encodedString.append(count);
	                }
	                currentChar = nextChar;
	                count = 1;
	            }
	        }
	        // Append the last character and its count
	        encodedString.append(currentChar);
	        if (count > 1) {
	            encodedString.append(count);
	        }

	        return encodedString.toString();
	    }
}
