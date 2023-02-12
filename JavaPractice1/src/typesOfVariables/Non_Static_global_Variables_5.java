package typesOfVariables;

public class Non_Static_global_Variables_5 {

	// Non - static global variables
	int i=30;
    String SS = "Rahul";
	
	public static void main(String[] args) {

		
//      System.out.println(i);
//      System.out.println(Non_Static_global_Variables_5.i);
		
		Non_Static_global_Variables_5 SG =new Non_Static_global_Variables_5();
	
		System.out.println(SG.i);
		System.out.println(SG.SS);
		
		SG.m2();   // Non static method
	
		Non_Static_global_Variables_5.m1();// calling by class name
		
		System.out.println();
		Non_Static_global_Variables_Different_Class_6 NSG =new Non_Static_global_Variables_Different_Class_6();
		
		System.out.println(NSG.age);
		System.out.println(NSG.name);
				   	
	}
	
	
	public static void m1() {
		
		Non_Static_global_Variables_5 SG1 =new Non_Static_global_Variables_5();
		
		System.out.println(SG1.i);
		System.out.println(SG1.SS);
		

	}
	
	public void m2() {
		
		System.out.println(i);
		System.out.println(SS);
		
		
	}

}