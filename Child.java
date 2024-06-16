
public class Child extends Parent{

	   public Child() {
	        super(); // Call to superclass constructor
	        System.out.println("Child class constructor is called");
	    }
	   
	   public static void main(String[] args) {
		Child c=new Child();
	}
}
