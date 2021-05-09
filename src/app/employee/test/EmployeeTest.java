package app.employee.test;

import java.util.Map;

import app.employee.exception.EmployeeNotFoundException;
import app.employee.model.Department;
import app.employee.model.Employee;
import app.employee.service.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("1.Create a New Employee");
		EmployeeServiceImpl empService = new EmployeeServiceImpl();

		Employee emp = new Employee();
		emp.setEmpID(10);
		emp.setEmpName("Ram");
		emp.setDepartment(new Department(3, "HP Department"));
		empService.createEmployee(emp);

		System.out.println();
		System.out.println("2.Find All Employees");
		Map<Integer, Employee> employees = empService.findAllEmployees();
		for (Map.Entry<Integer, Employee> e : employees.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		System.out.println();
		System.out.println("3.Find A Employee By Given Id");
		int id = 50;

		try {
			Employee foundEmployee = empService.findEmployeeById(id);
			System.out.println(foundEmployee);
		} catch (EmployeeNotFoundException e) {

		}

		System.out.println();
		System.out.println("4.Update A Employee by given Id");
		int updateId = 15;
		Employee newEmployee = new Employee();
		newEmployee.setEmpName("Siva");
		empService.updateEmployee(updateId, newEmployee);

		employees = empService.findAllEmployees();
		for (Map.Entry<Integer, Employee> e : employees.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		System.out.println();
		System.out.println("5.Delete A Employee by given Id");
		int deleteId = 3;
		empService.deleteEmployee(deleteId);
		employees = empService.findAllEmployees();
		for (Map.Entry<Integer, Employee> e : employees.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
}