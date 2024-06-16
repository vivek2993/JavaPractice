
public class Overloading extends Base{

	
	public void car(String engine) {
		System.out.println("Child class");
		
	}

	 
	public static void main(String[] args) {
		Base overloading=new Base();
		
		overloading.car("123456"); 
	}
}
class Base{
	
	public void car(String engine) {
		System.out.println("Base class");
		
	}
	
}