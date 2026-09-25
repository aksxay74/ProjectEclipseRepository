package Collectionpack;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Department {
	private int deptId;
	private String deptName;

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

}

class EmployeeClass {
	private int id;
	private String empName;
	private double empSalary;
	private Department department;
	
	

	public EmployeeClass(int id, String empName, double empSalary, Department department) {
	
		this.id = id;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public Department getDepartment() {
		return department;
	}

}
	


public class UsingThenCompare {
	public static void main(String[] args) { 
		Department depOne = new	Department(100,"IT");
		Department depTwo= new	Department(101,"HR");
		Department depThree = new	Department(102,"FINANCE");
		
		
		
		ArrayList<EmployeeClass> employee = new ArrayList<>();
		
		
		
		
		employee.add(new EmployeeClass(200, "akshay", 90000,depOne));
		employee.add(new EmployeeClass(201, "aleena", 60000,depTwo));
		employee.add(new EmployeeClass(202, "alex", 100000,depThree));	
		employee.add(new EmployeeClass(200, "goutham", 10000,depOne));
		employee.add(new EmployeeClass(200, "athul", 10000,depOne));
		
		
		
		System.out.println("sorted employee by department....and then  salary");
		
		employee.sort(Comparator.comparing(EmployeeClass em) -> e)
		
		
		
		}
		
		
		
		
		
		
	






		
	}
}
