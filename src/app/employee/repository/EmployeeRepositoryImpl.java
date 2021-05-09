package app.employee.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import app.employee.model.Department;
import app.employee.model.Employee;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	private static Map<Integer, Employee> empMap;

	public EmployeeRepositoryImpl() {
		Department dept1 = new Department(1, "Development");
		Employee emp1 = new Employee(1, "Madhan", dept1);

		Department dept2 = new Department(2, "Testing");
		Employee emp2 = new Employee(2, "Kumar", dept2);

		Department dept3 = new Department(3, "HP Dept");
		Employee emp3 = new Employee(3, "Rajesh", dept3);

		Department dept4 = new Department(4, "Accounts Dept");
		Employee emp4 = new Employee(4, "Mani", dept4);

		empMap = new HashMap<>();
		empMap.put(1, emp1);
		empMap.put(2, emp2);
		empMap.put(3, emp3);
		empMap.put(4, emp4);
	}

	@Override
	public void add(Employee emp) {
		int id = empMap.size() + 1;
		empMap.put(id, emp);
	}

	@Override
	public Map<Integer, Employee> findAll() {
		return empMap;
	}

	@Override
	public Employee findById(int id) {
		Employee emp = null;
		for (Map.Entry<Integer, Employee> e : empMap.entrySet()) {
			if (e.getKey() == id) {
				emp = e.getValue();
			}
		}
		return emp;
	}

	@Override
	public void update(int id, Employee emp) {
		for (Map.Entry<Integer, Employee> e : empMap.entrySet()) {
			if (e.getKey() == id) {
				e.getValue().setEmpName(emp.getEmpName());
			}
		}
	}

	@Override
	public void delete(int id) {
		Iterator<Entry<Integer, Employee>> it = empMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Employee> entry = it.next();
			if (entry.getKey() == id) {
				it.remove();
			}
		}
	}
}
