package Collectionpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionssDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listLinked = new LinkedList<Integer>();
		List<Integer> listVector = new Vector<Integer>();
		List<Integer> listStack = new Stack<Integer>();
		
		
		list.add(200);
		list.add(200);
		list.add(200);
		
		
		listLinked.add(300);
		listLinked.add(400);
		listLinked.add(600);
		
		listStack.add(2000);
		listStack.add(1200);
		listStack.add(2400);
		
		
		System.out.println("arraylist values \n===============================\n");
		for(Integer i: list)
		System.out.println(i);

		System.out.println("\nlinked list values\n===============================\n");
		for(Integer i: listLinked)
		System.out.println(i);

		System.out.println("\nvector values \n===============================\n");
		for(Integer i: listVector)
		System.out.println(i);

		System.out.println("\nstack values \n===============================\n");
		for(Integer i: listStack)
		System.out.println(i);
		}
		
		
		
		
		
		
		 
		
	}

