package com.starpattern;

class StarPattern7
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
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.printf(" ");
			}
			for(int d=3;d>=a;d--)
			{
				System.out.printf("*");
			}
			for(int v=2;v>=a;v--)
			{
				System.out.printf("*");
			}
		System.out.println("");
		}
		
	}
}
