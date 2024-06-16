
package com.stringprogram;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.LongToDoubleFunction;

public class LongestSubstringWithoutRepeatingCharacters {
	
	
	 public static int lengthOfLongestSubstring(String s) {
	      
		 HashSet<Character> set=new HashSet<>();
		 String longestoverall="";
		 String longesttillnow="";
		 
		 for(int i=0;i<s.length();i++) {
			 
			 char c=s.charAt(i);
			 if(set.contains(c)) {
				 longesttillnow="";
				 set.clear();
				 
			 }
			 
			 set.add(c);
			 longesttillnow+=c;
			 
			 if(longesttillnow.length() >longestoverall.length()) {
				 longestoverall=longesttillnow;
			 }
		 }
		 return longestoverall.length();
	    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
