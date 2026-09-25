package Collectionpack;

import java.util.Arrays;
import java.util.List;

public class CollectionUsingLambda {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,20,32,52);
		list.forEach(value->System.out.println(value));
		
		
	}
}
