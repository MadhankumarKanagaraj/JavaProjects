package app.employee.service;

import java.util.Map;

import app.employee.exception.EmployeeNotFoundException;
import app.employee.model.Employee;

public interface IEmployeeService {

	void createEmployee(Employee emp);

	Map<Integer, Employee> findAllEmployees();

	Employee findEmployeeById(int id) throws EmployeeNotFoundException;

	void updateEmployee(int id, Employee emp);

	void deleteEmployee(int id);
}
