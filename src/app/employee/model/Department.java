package app.employee.model;

public class Department {
	public int depID;
	public String depName;

	public Department() {
		super();
	}

	public Department(int id, String name) {
		super();
		this.depID = id;
		this.depName = name;
	}

	public int getDepID() {
		return depID;
	}

	public void setDepID(int depID) {
		this.depID = depID;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Department [depID=" + this.depID + ", depName=" + this.depName + "]";
	}
}
