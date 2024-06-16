package com.starpattern;

class StarPattern5
{
public static void main (String... s)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=2;j<=i;j++)
		{
			System.out.printf (" ");
		}
		for(int k=4;k>=i;k--)
		{
			System.out.printf ("*");
		}
		System.out.println ("");
	}
}
}