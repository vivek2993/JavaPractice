//Find Vowel,Consonant,Numerical Values
class Vowel
{
	public static void main (String s1[])
	{
		String s="123Vivek";
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
			
		else{ if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
			{
				vowel[v]=d;
			    v++;
		    }
			
			else
			{
				consonant[c]=d;
				c++;
			}}
		}
		System.out.println("Consonant are:");
		for(char item: consonant){
		System.out.print(item+" ");}
	    System.out.println(" ");
		System.out.println(" ");
	    System.out.println("vowel are:");
		for(char item1: vowel){
		System.out.print(item1+" ");}
	    System.out.println(" ");
	    System.out.println(" ");
	
	
	    System.out.println("Numeric are:");
		for(char item2: numeric){
		System.out.print(item2+" ");}
	
	}
}