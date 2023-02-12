package collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		HashSet<String> h2 = new HashSet<String>();
		
		h.add("dip");
		h.add(100);
		h.add('D');
		h.add(10.5f);
		h.add("Java");
		//h.add("dip");
		
		System.out.println(h);

//		System.out.println(h.add("dip"));//false
//		System.out.println(h.add("dipali"));//true
		
		//remove
		boolean x1 = h.remove("dip");
		boolean x2 = h.remove("dipaa");
		
		System.out.println(x1);
		System.out.println(x2);
		
		System.out.println(h);
		///h.remove(2);-----> we can't access elements using indexing
		
		//contains
		boolean a = h.contains('D');
		System.out.println("If D is present in h hashset retuns: "+x1);
		
		
		//isempty
		boolean y = h2.isEmpty();
		boolean z = h.isEmpty();
		
		System.out.println("h2 HashSet is Empty : "+y);
		System.out.println("h HashSet is Empty: "+z);
		
		System.out.println();
		
		//print hashset elements
		for(Object o : h)
		{
			System.out.println(o);
		}
		
		System.out.println();
		
		Iterator it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
