package Collectionpack;

import java.util.*;

class Employee {
	int empno;
	String name;
	int age;

	Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;

	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		return e1.name.compareTo(e2.name);
	}
}

public class OldwayWithoutGenerics {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new Employee(114, "Devu", 25));
		al.add(new Employee(105, "Bini", 26));
		al.add(new Employee(108, "Kripz", 24));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.empno + " " + e.name + " " + e.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Employee e = (Employee) itr2.next();
			System.out.println(e.empno + " " + e.name + " " + e.age);

		}

	}
}
