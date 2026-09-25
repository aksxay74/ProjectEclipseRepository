package Collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ForEachMutableTest {
	public static void main(String[] args) {
		List<StringBuilder> list = new ArrayList<StringBuilder>();
		
		list.append("java");
		list.append("luminar");
		list.append("technolab");
		System.out.println(list);
		
		for(StringBuilder sb : list) {
			sb.append("kochi");
		}
		System.out.println(list);
	}
}
