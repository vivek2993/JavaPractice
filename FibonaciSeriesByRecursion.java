

/*FibonaciSeries are sum of there adjecent 
Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
				0+1=1
				1+1=2
				2+3=5 and so on

Recursion means  function calls itself*/


public class FibonaciSeriesByRecursion {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int i=0;i<n;i++) {
			
			System.out.print(recursion(i)+" ");
		}
	}
	
	public static int recursion(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return recursion(n-1) + recursion(n-2);
	}
}
