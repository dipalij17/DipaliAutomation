package collection_set;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add("Java");
		hs.add(200);
		hs.add("Ruby");
		hs.add(50.5);
		
		System.out.println(hs);
		
		HashSet hs2 = new HashSet();
		
		hs2.add(10);
		hs2.add("Java");
		hs2.add(500);
		hs2.add(200);
		
		System.out.println(hs2);
		
		//hs.addAll(hs2);//Only add/displayed unique elements
		
		System.out.println(hs);
		
		System.out.println();
		
		hs.retainAll(hs2);//Only common element will displayed
		
		System.out.println(hs);
		
		
		System.out.println();
		
		hs.containsAll(hs2);
		
		HashSet hs3 = new HashSet();
		
		hs3.add(10);
		hs3.add("Java");
		hs3.add(500);
		hs3.add(200);
		
		System.out.println(hs2.containsAll(hs3));//returns true if all elements are matching
		
		System.out.println(hs.containsAll(hs2));//returns false if all elements are not matching

	}

}
