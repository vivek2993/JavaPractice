package com.stringprogram;


class CopyString
{
	public static void main(String[] arg)
	{
		String s="123456";
		char[] a=s.toCharArray();
		char[] b=new char[a.length];
		
		/*int i=0;
		while(i!=a.length)
		{
			b[i]=a[i];
			i++;
		}*/
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		System.out.println(b);
	}
}