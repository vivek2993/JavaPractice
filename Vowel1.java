//Fina[d] Vowel,Consonant,Numerical Values
class Vowel1
{
	public static void main (String s1[])
	{
		String s="123Vivek";
		       s=s.toLowerCase();
			   char[] a=s.toCharArray();
			   int len=a.length;
		char[] vowel=new char[7];
		char[] consonant=new char[7];
		char[] numeric=new char[7];
		
		int v=0;
		int c=0;
		int n=0;
		
		int d=0;
		while(d!=len)
		{
			if(a[d]>='a' && a[d]<='z')
			{
				if(a[d]== 'a' || a[d]=='e' || a[d]== 'i' || a[d]=='o' || a[d]=='u')
				{
					vowel[v]=a[d];
					v++;
				}
				else
				{
					consonant[c]=a[d];
					c++;
				}
			}
			else
			{
				numeric[n]=a[d];
				n++;
			}
			d++;
	
	    }
	System.out.println("Consonant are:");
		for(char item: consonant)
		{
			System.out.print(item+" ");
		}
	    System.out.println(" ");
		System.out.println(" ");
	    System.out.println("vowel are:");
		for(char item1: vowel)
		{
			System.out.print(item1+" ");
		}
	    System.out.println(" ");
	    System.out.println(" ");
	
	
	    System.out.println("Numeric are:");
		for(char item2: numeric)
		{
			System.out.print(item2+" ");
		}
}}