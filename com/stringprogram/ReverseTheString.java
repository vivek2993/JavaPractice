package com.stringprogram;
public class ReverseTheString
{
    public static void main(String[] args)
    {
        String s = "MyJava";
 
        //1. Using StringBuffer Class
 
        StringBuffer sb = new StringBuffer(s);
 
        System.out.println(sb.reverse());    //Output : avaJyM
 
        //2. Using iterative method
 
        char[] a = s.toCharArray();
 
        for (int i = a.length - 1; i >= 0; i--)
        {
            System.out.print(a[i]);    //Output : avaJyM
        }
 
        System.out.println();
 
		//3.
		char[] b=new char[a.length];
		
		int i=0;
		while(i!=a.length)
		{
			b[a.length-1-i]=a[i];
			i++;
		}
		System.out.println(a);
		System.out.println(b);
    }
}
