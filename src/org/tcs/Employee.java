package org.tcs;
//child class 1
public class Employee extends Company{
	
	public void empId() {
		System.out.println("Employee id is 123456");
	}
	
	public void empName() {
		System.out.println("Employee name is ravi");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.companyId();
		e.companyName();
		e.empId();
		e.empName();
	}

}
