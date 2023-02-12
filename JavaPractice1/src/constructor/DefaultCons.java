package constructor;

public class DefaultCons {

	public static void main(String[] args) {

		DefaultCons obj = new DefaultCons();
		
		obj.m1();
		
	}
	
	
	/*
	 * public DefaultCons(){
	 * 
	 * super();
	 * }
	 * 
	 */
	
	public void m1() {
		int a =10;
		int b =20;
		
		int sum = a+b;
		
		System.out.println(sum);
	
	}
	
	public DefaultCons(){
		 System.out.println("HELOO");
		 }
}
