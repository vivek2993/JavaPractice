package com.starpattern;

class StarPattern6
{
	public static void main(String[] arg)
	{
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
			System.out.printf(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.printf("*");
			}
			for(int a=2;a<=i;a++)
			{
				System.out.printf("*");
			}
			System.out.println(" ");
		}
		
	}
}
