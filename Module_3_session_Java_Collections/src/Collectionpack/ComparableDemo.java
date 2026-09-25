package Collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int age;
	int id;

	public Student(String name, int age, int id) {

		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public int compareTo(Student st) {
//		if (name == st.name) {
//			return 0;
//		} else if (age > st.age) {
//			return 1;
//		} else {
//			return -1;
//		}
		
//return this.name.compareTo(st.name);
		//return st.name.compareTo(this.name);
//		if(this.age!=st.age) {
//			return this.age-st.age;
//		}
//		return age;
		
		
	if(age==st.age) {
	if(id==st.id) {
		return 0;
		 
	}else if(id>st.id) {
		return 1;
	}else {
		return  -1;
	}
	}else if(id>st.id) {
		return 1;
	}else {
		return  -1;

}
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("akshay" , 22, 290));
		student.add(new Student(" alex"   , 22, 270));
		student.add(new Student("goutham", 12, 220));

		Collections.sort(student);

		for (Student st : student) {
			System.out.println(st.name + " " + st.age + " " + st.id);
		}

	}
}

