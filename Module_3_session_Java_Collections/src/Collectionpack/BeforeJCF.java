package Collectionpack;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeJCF {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		Vector<Integer> v = new Vector<Integer>();
		
		Hashtable<Integer,String> h = new Hashtable<Integer, String>();
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(100, "Akshay");
		h.put(102, "Aleena");
		
		
		System.out.println(arr[1]);
		
		System.out.println(v.elementAt(1));
		
		System.out.println(h.get(1));
		
		
		
	}

}
