package Collectionpack;

import java.util.ArrayList;
import java.util.List;

public class UsingGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("luminar");
		list.add("technolab");
		
	//list.add(20);
		
		Iterator<String> iter = lst.iterator(); // Iterator of Strings
		while (iter.hasNext()) {
		String str = iter.next(); // compiler inserts downcast operator
		System.out.println(str);
		}
	
		for (String str : lst) {
		System.out.println(str);
		}
		}
}
		
		
		
		
		
		
		
		//list.add(new Integer(1234));
	//	Integer obj = list.get(0);
//		System.out.println(list);
//	}
//}
