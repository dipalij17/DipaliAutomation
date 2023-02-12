package collection_list;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList();
		
		AL.add("Java");
		
		AL.add(100);
		
		AL.add('D');
		
		AL.add(10.5);
		
		AL.add(null);
		
		//Print ArrayList
		
		
		System.out.println("No of elements present in given arraylist is "+AL.size());
		
		System.out.println(AL);
		
		for(int i=0;i<AL.size();i++)
		{
			System.out.println(AL.get(i));
		}
		

	}

}
