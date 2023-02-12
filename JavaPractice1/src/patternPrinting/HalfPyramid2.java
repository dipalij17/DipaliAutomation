package patternPrinting;

public class HalfPyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows;
		rows=5;
		
		//outer loop
		for(int i=1;i<=rows;i++) {
			
			//inner loop
			for(int j=rows;j>=i;j--) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
