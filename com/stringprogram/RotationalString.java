//Rotational String->vivek -->ivekv,vekvi,ekviv,kvive
//Non-Rotational String-> vivek--> vviek
package com.stringprogram;

class RotationalString
{
	public static void main(String[] arg)
	{
		String a="vivek";
		String b="ivekv";
		
		//Concatinate String with itself
		String a1=a.concat(a);
		if(a1.contains(b))
			System.out.println("String b is ROTATIONAL STRING");
		else
			System.out.println("String b is not-- ROTATIONAL STRING");
	}
}