package typesOfVariables;

public class Static_global_Variables_2 {

	   static String name ="Rohit";
	  static int age =30;
	  
	  
	   
	public static void main(String[] args) {

	
		
		Static_global_Variables_2.m1();
		
		Static_global_Variables_2 SGV =new Static_global_Variables_2();
		SGV.m2();
		
	}
	
	public static void m1() {
		
		System.out.println(name);
		System.out.println(age);
		
		
	}
	
	public void m2() {
		
		System.out.println(name);
		System.out.println(age);
	}

}