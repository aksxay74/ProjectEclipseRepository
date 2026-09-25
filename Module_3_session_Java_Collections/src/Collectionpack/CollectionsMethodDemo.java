package Collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsMethodDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Java");
		list.add("JAVA");
		list.add(3,"spring");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("JSP"));
		
Collections.sort(list);	

	System.out.println(list);

		
		
	
Set<String> set = new HashSet<>();
	
	set.add("Java");
	set.add("JSP");
	set.add("Java");
	set.add("JAVA");
	set.add("spring");
	
	System.out.println(set);

	System.out.println(set.contains("JSP"));
	
	
	
	
Map<Integer,String> map = new HashMap<>();
	
	map.put(200,"Java");
    map.put(202,"JSP");
	map.put(203,"python");
	map.put(304,"c++");
	map.put(101,"kotlin");
	
	System.out.println(map);

	System.out.println(set.contains("JSP"));
	System.out.println(map.keySet());
	System.out.println(map.values());
	
	
		
	}

}