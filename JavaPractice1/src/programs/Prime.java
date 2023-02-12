package programs;

public class Prime {

	public static void main(String[] args) {
		
		
		int num =20;
		
		int count =0;
		
		if(num>1)
		{
			for(int i=2;i<=num;i++)
			{
				if(num%i == 0)
					count++;
			}
			
			if(count == 2)
				
			{
				System.out.println("Prime no");
			}
			else {
				System.out.println("Not prime");
			}
		}
		
		else
		{
			System.out.println("Number is not prime");	
		}

	}

}
