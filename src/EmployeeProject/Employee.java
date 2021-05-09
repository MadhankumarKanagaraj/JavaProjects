package EmployeeProject;

public class Employee {
	private int empID;
	private String empName;
	public Department department;
	int i = 0;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.empID = id;
		this.empName = name;
	}

	public void SetEmployeeID(int id) {
		this.empID = id;
	}

	public int GetEmployeeID() {
		return this.empID;
	}

	public void SetEmployeeName(String name) {
		this.empName = name;
	}

	public String GetEmployeeName() {
		return this.empName;
	}

	public String ToString() {
		return "Emp ID: " + this.empID + "\nEmp Name: " + this.empName + "\nDepartment:\n  " + department.ToString();
	}

	public void SetDepartment(Department department) {
		this.department = department;
	}
}
