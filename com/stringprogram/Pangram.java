//PANGRAM-word or sentence contain all the letter from a to z
package com.stringprogram;

class Pangram
{
	public static void main(String[] arg)
	{
		String s="the quick brown fox jumps over a lazy dog";
		s=s.replace(" ","");
		char[] a=s.toCharArray();
		
		int[] b={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;
		while(i!=a.length)
		{
			int index=a[i]-65;
			b[index]=1;
			i++;
		}
		i=0;
		while(i!=26)
		{
			if(b[i]== 1)
			{
				i++;
			}
			else {
				System.out.println("not-pangram");
				System.exit(0);
			}
		}
		System.out.println("PANGRAM");
		
	}
}