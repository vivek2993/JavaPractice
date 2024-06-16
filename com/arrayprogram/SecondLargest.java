package com.arrayprogram;
class SecondLargest
{
	public static void main(String s[])
	{
		int[] a={3,5,9,2,4,7};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print("2nd largest value in this array:"+a[1]);
	}
}