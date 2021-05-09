package app.employee.repository;

import java.util.Map;

import app.employee.model.Employee;

public interface IEmployeeRepository {

	public void add(Employee emp);

	public Map<Integer, Employee> findAll();

	public Employee findById(int id);

	public void update(int id, Employee emp);

	public void delete(int id);
}
