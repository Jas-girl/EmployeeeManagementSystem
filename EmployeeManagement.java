package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagement {
Employee emp[];
public EmployeeManagement(int n) {
	emp=new Employee[n];
}
public EmployeeManagement() {
	
}
Scanner sc=new Scanner(System.in);
void add() {
	for (int i = 0; i < emp.length; i++) {
		System.out.println("Employee:"+(i+1));
		System.out.println("\nEnter the id \nEnter the name \nEnter the designiation \nEnter the department"
				+ "\nEnter the salary ");
		emp[i]=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextFloat());
	}
	
}
void display() {
	for (int i = 0; i < emp.length; i++) {
		System.out.println(emp[i].toString());
	}
}
void update(int id) {
	boolean flag=false;
	for (int i = 0; i < emp.length; i++) {
		if(id==emp[i].getId()) {
			System.out.println("Enter the name to change");
			emp[i].setName(sc.next());
			flag=true;
			break;
		}
		else {
			flag=false;
		}
	}
	System.out.println(flag==true?"update the employee name":"not updated ");
	
}

void updateDept(int id) {
	boolean flag=false;
	for (int i = 0; i < emp.length; i++) {
		if(id==emp[i].getId()) {
			System.out.println("Enter the dept to change");
			emp[i].setDepartment(sc.next());
			flag=true;
			break;
		}
		else {
			flag=false;
		}
	}
	System.out.println(flag==true?"update the employee department":"not updated ");
	
}
void searchId(int id) {
	boolean flag=false;
	for (int i = 0; i < emp.length; i++) {
		if(emp[i].getId()==id) {
			System.out.println(emp[i].toString());
			flag=true;
			break;
		}
		else {
			flag=false;
		}
		
	}
	System.out.println(flag==true?"employee is found":"employee is not found");
}
void searchName(String name) {
	boolean flag=false;
	for (int i = 0; i < emp.length; i++) {
		if(emp[i].getName().equalsIgnoreCase(name)) {
			System.out.println(emp[i].toString());
			flag=true;
			break;
		}
		else {
			flag=false;
		}
		
	}
	System.out.println(flag==true?"employee is found":"employee is not found");
}
void searchDept(String dept) {
	boolean flag=false;
	for (int i = 0; i < emp.length; i++) {
		if(emp[i].getDepartment().equalsIgnoreCase(dept)) {
			System.out.println(emp[i].toString());		
			flag=true;
		}	
		else {
			flag=false;
		}
	}
	System.out.println(flag==true?"employee is found":"employee is not found");
}
}
