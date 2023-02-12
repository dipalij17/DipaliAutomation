package exceptionHandling;

public class Exception1 {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int a,b; 
		a=10;
		
		
		try {

		System.out.println(a/0);  //Arithmatic execption
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		String text ="I am Dipali";
		
		try {
		int n = Integer.parseInt(text);   //NumberFormatException
		}
		catch(NumberFormatException ne) {
			System.out.println(ne.getMessage());
			ne.printStackTrace();
		}
		
		String str = null;
		
		try {
			System.out.println(str.length());    //NullPointerException
		}
		catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
			ne.printStackTrace();
		}
		
		
		int arr[] = new int[10];
//		
		arr[1]=20;
		
		try {
		arr[20]=100;    //ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		
		
		
	
		
	}

}
