package Collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTimeConsumingDemo {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("apple");
		list1.add("orange");
		list1.add("watermelon");
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("kiwi");
		list2.add("grapes");
		list2.add("walnut");
		
		list1.addAll(1, list2);
		
		System.out.println(list1);
		
		list1.removeIf(data->data.endsWith("s"));
		System.out.println(list1);
		
		
		
		
}
}
