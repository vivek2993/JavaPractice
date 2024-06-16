//AAGAMI
//Read text from file and get Prime no.
import java.io.*;

class FilePrimeNo
{
	public static void main (String s1[]) throws Exception
	{
	FileInputStream fis=new FileInputStream("kkk.txt");
	byte[] b=new byte[fis.available()];
	
	fis.read(b);
	int temp=0;
	System.out.println("Output of file replacing ASCII value from character when it is prime no:  ");

	for(int i=0;i<b.length;i++)
	{
		for(int j=2;j<(b[i]);j++)
		{
			if(b[i]%j ==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.print(b[i]);
		}
		else
		{
			temp=0;
			System.out.print((char)b[i]);
		}
	}
	System.out.println("  ");
	System.out.println("  ");
	System.out.println("Normal Output of file:  ");
	String s=new String(b);
	System.out.println(s);
}}