package swapping;

public class UsingPlusMinusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		
		a=10;   b=5;
		
		a = a+b;    //a = 15
		b = a-b;   //b  =15-5====>  10
		a = a-b;   //a = 15-10  ===>  5
		
		
		System.out.println("Value of a after swapping is: "+a);
		
		System.out.println("Value of b after swapping is: "+b);
		
	}

}
