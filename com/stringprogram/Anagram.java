/* 
 * 
 * ANAGRAM -word or phrase formed by rearranging the letters..example -> listen,silent
 *  
 * */
package com.stringprogram;
import java.util.*;


class Anagram
{
	public static void main(String[] arg)
	{
		String a="listen";
		char[] a1=a.toCharArray();
		
		String b="silent";
		char[] b1=b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		boolean result=Arrays.equals(a1,b1);
		
		if(result== true)
			System.out.println("ANAGRAM");
		else
			System.out.println("not-ANAGRAM");
	}
}