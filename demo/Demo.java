package demo;

public class Demo {

	public static void main(String[] args) {
		
		String str = "Radar";
		
		String reverseString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverseString=reverseString+str.charAt(i);
			
		}
		
		if(str.equalsIgnoreCase(reverseString))
			System.out.println("sahi h");
	}
}
