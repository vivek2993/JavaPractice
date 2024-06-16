package com.stringprogram;

/**
 * In this class we have to find out the count of special character present in
 * the string and remove it from the string
 */
public class FindSpecialCharCountAndRemoveIt {

	public static void main(String[] args) {

		String str = "Vivek@#$234";

		int count = 0;
		String newstr="";
		String specialchars="";
		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				specialchars=specialchars+str.charAt(i);
				count++;
			}else {
				newstr=newstr+str.charAt(i);
			}

		}
		
		System.out.println("String without special char ::::::::::: "+newstr);
		
		if(count!=0) {
			System.out.println("Count of special char are :::::::::::"+count);
			System.out.println("Special char are :::::::::::"+specialchars);
		}
			
		
	}
}
