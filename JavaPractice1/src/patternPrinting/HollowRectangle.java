package patternPrinting;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows,cols;
		
		rows=4;   cols=5;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=cols;j++)
			{
				if(i == 1 || j ==1 || i == rows || j == cols)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
