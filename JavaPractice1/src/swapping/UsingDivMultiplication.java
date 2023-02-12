package swapping;

public class UsingDivMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		
		a=15;
		b=10;
		
		a = a*b;
		
		b= a/b;       //a*b/b===>a
		
		a = a/b;        //a*b/(b=a)===>b
		
		System.out.println("Value of a after swapping is: "+a);
		
		System.out.println("Value of b after swapping is: "+b);
		
		
		
	}

}
