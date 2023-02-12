package typesOfVariables;

public class Static_global_Variables_1 {

	//Creating variables outside the method/functions/block is known as as global variable.
	//Static global variables call from same class
	static int number = 100;  // static global varibles
	
	
	
	public static void main(String[] args) {
		

        System.out.println(number);  // direct calling
        
        Static_global_Variables_1 SGV = new Static_global_Variables_1();
        SGV.m1();
        SGV.m2();
		
	}
	
	public void m1() {
		
		System.out.println(number);
		System.out.println(number);
		
	}
	public void m2() {
		
		System.out.println(number);
	}

}
