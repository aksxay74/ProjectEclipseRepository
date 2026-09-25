package Collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("apple");
		list1.add("orange");
		list1.add("watermelon");
		
		
		
		
		
	List<String> list2 = new ArrayList<String>();
		
		list2.add("grapes");
		list2.add("kiwi");
		list2.add("pineapple");
//		System.out.println(list);
//		Iterator<String>iter = list.iterator();
		
		list1.addAll(list2);
		System.out.println(list1.contains("android"));
		System.out.println(list1);
		
	System.out.println(	list2.remove(1));
	
	list1.removeIf(data->data.endsWith("e"));
	System.out.println(list1);
		
//		while(iter.hasNext()) {
//			String str = iter.next();
//			System.out.println(str);
//		}
		
		
	
		
	}
}
