package patternPrinting;

public class HalfPyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows;
		rows=5;
		
		for(int i=1;i<=rows;i++) //no of rows --> no of stars 
			
			
		{
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
