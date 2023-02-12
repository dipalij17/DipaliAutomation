package patternPrinting;

public class SolidRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows,cols;
		
		rows=4;
		cols=5;
		
		int i,j;
		
		//outer loop
		for(i=1;i<=rows;i++)
		{
			//inner loop
			for(j=1;j<=cols;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
