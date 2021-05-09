package app.employee.service;

import java.util.Map;

import app.employee.exception.EmployeeNotFoundException;
import app.employee.model.Employee;
import app.employee.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements IEmployeeService {
	private EmployeeRepositoryImpl empRepository;

	public EmployeeServiceImpl() {
		empRepository = new EmployeeRepositoryImpl();
	}

	@Override
	public void createEmployee(Employee emp) {
		empRepository.add(emp);
	}

	@Override
	public Map<Integer, Employee> findAllEmployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		Employee emp = empRepository.findById(id);
		if (emp == null) {
			throw new EmployeeNotFoundException("Employee is not found");
		} else {
			return emp;
		}
	}

	@Override
	public void updateEmployee(int id, Employee emp) {
		empRepository.update(id, emp);
	}

	@Override
	public void deleteEmployee(int id) {
		empRepository.delete(id);
	}
}
