import java.util.Arrays;
import java.util.List;

public class Try {

	 

	public static void main(String[] args) {
 
		int arr[] =  {12, 0, 7, 0, 8, 0, 3};
		 
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i] !=0) {
				arr[temp]=arr[i];
				temp++;
				
			}
		}
	}
}
