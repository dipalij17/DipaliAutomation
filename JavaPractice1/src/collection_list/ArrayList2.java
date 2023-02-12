package collection_list;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList();
		
		ArrayList AL1 = new ArrayList();
		
		AL.add(100);
		AL.add("Java");
		AL.add(true);
		AL.add("Welcome");
		AL.add(null);
		AL.add(25.5);
		
		//print ArrayList
		System.out.println(AL);
		
		System.out.println("ArrayList size is: "+AL.size());
		
		//remove
		AL.remove(2);
		
		System.out.println(AL);
		
		//insert new element at particular index
		AL.add(2,"Hello");
		
		System.out.println(AL);
		
		//Change/Replace/Update element
		AL.set(2, "Dipali");
		
		System.out.println(AL);
		
		//isEmpty
		System.out.println(AL.isEmpty());
		System.out.println(AL1.isEmpty());
		
		//read elements 
		for(Object o:AL)
		{
			System.out.println(o);
		}
		
		
		//remove all
		AL.removeAll(AL);
		
		System.out.println(AL);

	}

}
