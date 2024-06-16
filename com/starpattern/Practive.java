package com.starpattern;
class Practive
{
	public static void main(String[] arg)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				if(i>=1 && i>=3 && j<=3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}