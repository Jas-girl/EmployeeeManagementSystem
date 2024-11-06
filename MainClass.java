package EmployeeManagementSystem;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int no=0;
		EmployeeManagement e=null ;
		do {	
			System.out.println("\nChoice 1:Add the employees \nChoice 2:Display \nChoice 3:Update \nChoice4: Search");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter the no of employees");
				no = sc.nextInt();
				e = new EmployeeManagement(no);
				e.add();break;
			case 2:e.display();break;
			case 3:
				System.out.println("Update");
				System.out.println("\nChoice1:Enter the name through id \nChoice2:Enter the department thrrough id");
				int value = sc.nextInt();
				if (value == 1) {
					System.out.println("Enter the id where u want to change the name");
					int n = sc.nextInt();
					e.update(n);
				} else if (value == 2) {
					System.out.println("Enter the id where u want to change the department");
					int n1 = sc.nextInt();
					e.updateDept(n1);
				}
				break;
			case 4:
				System.out.println("Search");
				System.out.println("\nChoice1:Enter the  id \nChoice2:Enter the  department \nChoice3:Enter the name");
			int val = sc.nextInt();
			if(val==1) {
				System.out.println("Enter the id u want to search");
				int id=sc.nextInt();
			    e.searchId(id);
			}
			else if(val==2) {
				System.out.println("Enter the department to search");
				String dept=sc.next();
				e.searchDept(dept);
			}
			else if(val==3) {
				System.out.println("Enter the name of employee to search");
			String name=sc.next();
				e.searchName(name);
			}
			break;
			default:System.out.println("Exit operation");
			
			}
		} while (ch < 4);



	}
}
