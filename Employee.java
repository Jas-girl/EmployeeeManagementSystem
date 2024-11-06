package EmployeeManagementSystem;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String department;
	private float salary;

	public Employee(int id, String name, String designation, String department, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", salary=" + salary + "]";
	}

}
