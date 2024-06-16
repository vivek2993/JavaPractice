// 121,232
package com.stringprogram;

import java.util.*;
class Palindrome
{
	public static void main(String sd[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	 
	char[] a=s.toCharArray();
	int len=a.length;
	char[] b=new char[len];
	
	//Store data from a[] to b[]
	int i=0;
	while(i!=len)
	{
		b[len-1-i]=a[i];
		i++;
	}
	 
	//Check palindrome or not
	i=0;
	while(i!=len)
	{
		if(b[i]!=a[i])
		{
			System.out.println("not-palindrome");
			System.exit(0);
		}
		else
		{
			i++;
			//continue;
		}
	}
	System.out.println("palindrome");
	
	
}}