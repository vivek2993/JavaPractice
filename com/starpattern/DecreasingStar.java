 package com.starpattern;
 
 class DecreasingStar
{
public static void main (String... s)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
		System.out.printf ("*");
		}
		System.out.println ("");
    }
}}