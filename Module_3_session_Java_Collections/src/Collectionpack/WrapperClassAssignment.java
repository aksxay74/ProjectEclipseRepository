package Collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperClassAssignment {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
			list.add(7.4);
			list.add(10.4);
			list.add(11.2);
			list.add(2.4);
			list.add(3.5);
			
			
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("DESCENDING ORDER " + list);
		
		
	
		
		
			
	
	}
	
	
}
