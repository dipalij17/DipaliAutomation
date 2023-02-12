package swapping;

public class UsingTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =10;
		int b =20;
		
		int temp;
		
		
		temp=a;        //temp = 10
		a=b;           //a= 20
		b=temp;        //b= 10
		
		System.out.println("Value of a after swapping is: "+a);
		
		System.out.println("Value of b after swapping is: "+b);
		
	}

}
