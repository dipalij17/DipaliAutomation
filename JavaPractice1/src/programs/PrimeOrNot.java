package programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		//1. Natural no -- >1
		//2. factors -2 -- 1 & no itself
		
		int num = 20;
		
		int count =0;
		
		if(num > 1)//20>1
		{
			for(int i=1;i<=num;i++)//i=21  21<=20
			{
				if(num%i == 0)//20% == 0
				{count++;	}  //1+1=2+1=3+1=4+1=5+1=6
				
			}
			
			
			
			if(count == 2)
			{
				System.out.println("No is prime");
			}
			
			else {
				System.out.println("No is not Prime");
			}
			
			
		}
		
		else {
			System.out.println("No is not Prime");
		}
		

	}

}
