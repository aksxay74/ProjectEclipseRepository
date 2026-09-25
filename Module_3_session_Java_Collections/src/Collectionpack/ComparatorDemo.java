package Collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	int empNo;
	String name;
	int age;

	public Employee(int empNo, String name, int age) {

		this.empNo = empNo;
		this.name = name;
		this.age = age;
	}

}


class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.age==e2.age) {
		return 0;
	}else if(e1.age>e2.age) {
		return 1;
	}else {
		return -1;
	}
	
}
}

	class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
		  return e1.name.compareTo(e2.name);
			
		}
		
	
	}
	
	
public class ComparatorDemo {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(100,"Akshay",22));
		list.add(new Employee(101,"Aleena",21));
		list.add(new Employee(102,"Alex",24));
		list.add(new Employee(103,"Athul",20));
		
		System.out.println("sorting by name ");
		
		Collections.sort(list,new NameComparator());
		for(Employee emp : list) {
		System.out.println(emp.empNo + " " + emp.name + " " + emp.age);	
		}
		
		
		Collections.sort(list,new AgeComparator());
		for(Employee emp : list) {
		System.out.println(emp.empNo + " " + emp.name + " " + emp.age);	
		}
		
		
		
		}
		
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

