package Collectionpack;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizerExample {
	public static void main(String[] args) {
		String sentence = "Hello, World!: This is Java: the best language; period.";
		
		StringTokenizer element = new 	StringTokenizer(sentence,",!:;");
		
		ArrayList<String> list = new 	ArrayList<String>();
		
		
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("hello");

		System.out.println(list.indexOf("hello"));      // 0
		System.out.println(list.lastIndexOf("hello"));  // 3
		System.out.println(list.indexOf("java"));       // 2
		System.out.println(list.indexOf("python"));     // -1 (not found)
		
//		while(element.hasMoreTokens()) {
//			String temp = element.nextToken().toLowerCase();
////			if(!list.contains(temp)) {
////				list.add(temp);
//			
////			}
//			System.out.println(temp.s('d'));
//			
//		
////				
////		for(String i : list) {
////			System.out.println(i);
////		}
////		
		
	
	
	
}
}