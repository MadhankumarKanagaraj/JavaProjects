package app.employee.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import app.employee.model.Department;

public class DepartmentRepository {

	private static Map<Integer, Department> deptMap;

	public DepartmentRepository() {
		Department dept1 = new Department(1, "SW Development");
		Department dept2 = new Department(2, "SW Testing");
		Department dept3 = new Department(3, "HP");
		Department dept4 = new Department(4, "Accounts");

		deptMap = new HashMap<>();
		deptMap.put(1, dept1);
		deptMap.put(2, dept2);
		deptMap.put(3, dept3);
		deptMap.put(4, dept4);
	}

	public void add(Department dept) {
		int id = deptMap.size() + 1;
		deptMap.put(id, dept);
	}

	public Map<Integer, Department> findAll() {
		return deptMap;
	}

	public Department findById(int id) {
		Department dept = null;
		for (Map.Entry<Integer, Department> d : deptMap.entrySet()) {
			if (d.getKey() == id) {
				dept = d.getValue();
			}
		}
		return dept;
	}

	public void update(int id, Department dept) {
		for (Map.Entry<Integer, Department> d : deptMap.entrySet()) {
			if (d.getKey() == id) {
				d.getValue().setDepName(dept.getDepName());
			}
		}
	}

	public void delete(int id) {
		Iterator<Entry<Integer, Department>> it = deptMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Department> entry = it.next();
			if (entry.getKey() == id) {
				it.remove();
			}
		}
	}
}
