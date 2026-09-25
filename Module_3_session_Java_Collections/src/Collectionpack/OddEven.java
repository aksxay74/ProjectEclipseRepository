package Collectionpack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface EvOdd{
boolean check(int a);
	
}


public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int a = sc.nextInt();
		
	   EvOdd  d = (n)-> a %2==0;
		
		if(d.check(a)) {
			System.out.println("it is an even number");
		}else {
		
		System.out.println("it is an odd number");
		
		}
		
		
	}
}
