package collection_set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("Java");
		h.add("Ruby");
		h.add("Hello");
		h.add("Selenium");
		
		System.out.println(h);
		
		System.out.println();
		
		HashSet h2 = new HashSet();
		
		h2.addAll(h);
		
		System.out.println(h2);

		System.out.println();
		
		System.out.println(h.addAll(h));//returns false bcoz elements are duplicates 
		
		
		System.out.println();
		
		HashSet h3 = new HashSet();
		h3.add("Java");
		
		h.removeAll(h3);//remove duplicate elemets from h (h will be compared with h3)
		System.out.println(h);
		System.out.println(h2);
		
	}

}
