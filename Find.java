class Find
{
	public static void main(String arg[])
	{
		String s="1234xyzaeiuo";
		       s=s.toLowerCase();
		char[] vowel=new char[7];
		char[] consonant=new char[7];
		char[] numeric=new char[7];
		
		int v=0;
		int c=0;
		int n=0;
		char d;
		
		for(int i=0;i<s.length();i++)
		{
			d=s.charAt(i);
			if(d>='0' && d<='9')
			{
				numeric[n]=d;
				n++;
			}
			else if(d=='a'|| d=='e' || d=='i' || d=='o' || d=='u')
			{
				vowel[v]=d;
				v++;
			}
			else
			{
				consonant[c]=d;
				c++;
			}
			
		}
		System.out.println("Numeric value: ");
		for(char it:numeric)
		{
			System.out.println(it+" ");
		}
		System.out.println("Vowel value: ");
		for(char it1:vowel)
		{
			System.out.println(it1+" ");
		}
		System.out.println("consonant value: ");
		for(char it2:consonant)
		{
			System.out.println(it2+" ");
		}
		
	}
}
