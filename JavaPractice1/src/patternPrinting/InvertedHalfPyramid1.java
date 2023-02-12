package patternPrinting;

public class InvertedHalfPyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=4;
		
		//outer loop
		for(int i=1;i<=rows;i++)//i=4
		{
			
			//inner loop ---> space printing
			for(int j=1;j<=rows-i;j++)
				
				//j=4-4=0
			{
				System.out.print(" ");
			}
			
			
			
			
			//inner loop ---> star printing
			for(int k=1;k<=i;k++)//i=2
				
				//i=1,2,3,4
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
