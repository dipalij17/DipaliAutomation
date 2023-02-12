package swapping;

public class UsingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		
		a=10;   b=30;
		
		a = a^b;
		
		b = a^b;
		
		a = a^b;
		
		System.out.println("Value of a after swapping is: "+a);
		
		System.out.println("Value of b after swapping is: "+b);
		
		
	}

}
