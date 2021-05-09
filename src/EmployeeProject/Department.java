package EmployeeProject;

public class Department {
	public int depID;
	public String depName;

	public Department() {

	}

	public Department(int id, String name) {
		this.depID = id;
		this.depName = name;
	}

	public void SetDepartmentID(int id) {
		this.depID = id;
	}

	public int GetDepartmentID() {
		return depID;
	}

	public void SetDepartmentName(String name) {
		this.depName = name;
	}

	public String GetDepartmentName() {
		return depName;
	}

	public String ToString() {
		return "Dept ID: " + depID + "\n  Dept Name: " + depName;
	}
}
