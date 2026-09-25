package Collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFastIterator {
	public static void main(String[] args) {
		
		//no exception we used CopyOnWriteArrayList with FOR-EACH
//		CopyOnWriteArrayList<String> items = new CopyOnWriteArrayList<String>();
//		items .add("apple");
//		items .add("orange");
//		items .add("grapes");
//		
//		
//		for(String s : items ) {
//			if(s.equals("orange")) {
//				items.remove(s);
//			}
//			
//		}
//		
//		System.out.println(items);
		
		
		//no exception we used CopyOnWriteArrayList with FOR-EACH
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("apple");
		arr .add("orange");
	    arr.add("grapes");
	
		for(int i=0;i<arr.size();i++) {
			arr.get(i);
		}
		System.out.println(arr);
		
		
		
		//Iterator<String> iter = new Iterator<String>();
		
	}

}
