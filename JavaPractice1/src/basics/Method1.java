package basics;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test();
		
		Method1 obj = new Method1();
		
		obj.test();
		
		testArgument(2,5);
	}
	
	public void test()
	
	{
		System.out.println("Helloo!!!");
	}
	
	
	public static void testArgument(int a, int b)//Method1.test();
	{
		//a=2;b=5;
		
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of a after swapping is : "+a);
		
		System.out.println("Value of a after swapping is : "+b);
	}

	
	
	
	
}
