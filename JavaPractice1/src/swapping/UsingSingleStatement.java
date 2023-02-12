package swapping;

public class UsingSingleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		
		a =10;
		b=50;
		
		
		b = (a+b) - (a=b);
		
		System.out.println("Value of a after swapping is: "+a);
		
		System.out.println("Value of b after swapping is: "+b);
		
	}

}
