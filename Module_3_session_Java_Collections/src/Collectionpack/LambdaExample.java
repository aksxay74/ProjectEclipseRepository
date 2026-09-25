package Collectionpack;

interface Example{
	int sum(int a,int b);
	
}


public class LambdaExample {
	public static void main(String[] args) {
		Example e = (a,b)->a+b;
		System.out.println(e.sum(100, 200));
			
		
		
	}
}
