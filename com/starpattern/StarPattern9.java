package com.starpattern;


/*  *
   *
  *            */
class StarPattern9
{
	public static void main(String[] arg)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("-");
			} 
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print("o");
				}   

				else
				{
					System.out.print("*");
				}
				
			}
		System.out.println("");
		}
	}
}