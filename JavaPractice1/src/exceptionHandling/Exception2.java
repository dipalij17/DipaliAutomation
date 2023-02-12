package exceptionHandling;

public class Exception2 {

	public static void main(String[] args) {

		System.out.println("Hello");

		int a, b;
		a = 10;
		String text = "I am Dipali";

		int n = Integer.parseInt(text);

		try {

			System.out.println(a / 0); // Arithmatic execption

			// String text ="I am Dipali";

			// int n = Integer.parseInt(text); //NumberFormatException

			String str = null;

			System.out.println(str.length()); // NullPointerException

			int arr[] = new int[10];
//		
			arr[1] = 20;

			arr[20] = 100; // ArrayIndexOutOfBoundsException

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
