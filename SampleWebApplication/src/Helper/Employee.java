package Helper;

public class Employee {
	private long EmployeeId;
	private String EmployeeName;
	private String delimeter = "\t";

	public Employee(long EmployeeId, String EmployeeName) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
	}

	public Employee() {

	}

	public long getEmployeeId() {
		return this.EmployeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("");
		sb.append("EmpId:").append(EmployeeId).append(delimeter);
		sb.append("EmpName:").append(EmployeeName);
		return sb.toString();
	}
}
