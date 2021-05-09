package EmployeeProject;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.SetEmployeeID(1);
		emp.SetEmployeeName("Madhan");

		Department dept = new Department();
		dept.SetDepartmentID(1);
		dept.SetDepartmentName("ECE");

		emp.SetDepartment(dept);
		
		System.out.println(emp.ToString());
		
		
		System.out.println();
		
	}
}
