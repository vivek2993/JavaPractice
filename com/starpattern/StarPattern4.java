package com.starpattern;


class StarPattern4
{
public static void main (String... s)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.printf (" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.printf ("*");
		}
		System.out.println ("");
	}
}
}