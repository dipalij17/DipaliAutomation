package constructor;

public class This {

	int num =10;
	
	int sum = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This o = new This();
		o.m1();	
	}
	
	public void m1() {
		
		int num1;// =70;
		int sum =40;
		
		System.out.println("Local var "+num);
		System.out.println("Global var "+this.num);
	}

}
