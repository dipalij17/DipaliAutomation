package patternPrinting;

public class NumberPattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5;
		
		//outer for loop
		for(int i=1;i<=rows;i++) {
			
			//inner for loop
			for(int j=rows;j>=i;j--)
			
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}

}
