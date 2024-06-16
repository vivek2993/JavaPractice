import java.util.Scanner;
class Reverse
{
	public static void main(String []arg)
	{
		Scanner no=new Scanner(System.in);
		int n=no.nextInt();
		int t=n;
		int reverse=0;
		int rem;
		while(t!=0)
		{
			rem=t%10;
			reverse=reverse*10+rem;
			t=t/10;
		}
		System.out.println(reverse);
	}
}