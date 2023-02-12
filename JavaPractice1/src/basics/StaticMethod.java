package basics;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//swap(2,8);//method calling
		
	//Test();
	
	//Test();

		
		
		int returnvalue = add2(2,10);
		System.out.println(returnvalue);
	}
	
	
	public static void Test()
	{
		System.out.println("Inside static method ");
	}
	
	public static void Test2()
	{
		System.out.println("Inside 22222   static method ");
	}
	
	public static void swap(int a, int b) //method defination
	{
		
		int temp;
		
		
		// INPUT --- a= 6,   b = 2
		
		
		// oUTPUT --- a= 2,   b = 6
		
		temp = a;    //temp= 6
		
		a = b;    // a= 2
		
		b = temp;   // b = 6
		
		System.out.println("Value of a after swapping is :"+a);
		
		System.out.println("Value of b after swapping is :"+b);
		
	
	}
	
	public static int add2(int f, int c)
	{
		
		int addition = f+c;
		
		//System.out.println(addition);
		
		return addition;
		
	}
	

}
