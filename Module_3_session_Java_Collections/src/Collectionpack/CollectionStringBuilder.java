package Collectionpack;

import java.util.ArrayList;
import java.util.List;

public class CollectionStringBuilder {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("luminar");
		list.add("technolab");
		System.out.println(list);
		
		
		for(String str : list) {
			
			str+="kochi";
			
		}
		
		System.out.println(list);

}
}
