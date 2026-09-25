package Collectionpack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class TreeHashSet {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("Apple");
		hashset.add("orange");
		hashset.add("orange");
		hashset.add("apple");
		hashset.add("pineapple");
		
		System.out.println(hashset);
		
		
		Enumeration e = Collections.enumeration(hashset);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
	}
}
