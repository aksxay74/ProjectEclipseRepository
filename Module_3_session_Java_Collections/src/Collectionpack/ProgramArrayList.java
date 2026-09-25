package Collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		
		
		Iterator<Integer> iter = list.iterator();
		
	while(iter.hasNext()) {
		int num = iter.next();
		System.out.println(num);
	}
		
	}
}
