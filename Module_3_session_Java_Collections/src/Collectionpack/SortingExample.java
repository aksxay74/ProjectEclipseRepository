package Collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("grapes");
		list.add("kiwi");
		list.add("pineapple");
		
		
		
		Collections.sort(list);
	System.out.println(list);
	
	
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
	

}
}