
public class Employee {
private int employeeId;
private String employeeName;
private String emloyeeDepartment;
public Employee(int employeeId, String employeeName, String emloyeeDepartment) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.emloyeeDepartment = emloyeeDepartment;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmloyeeDepartment() {
	return emloyeeDepartment;
}
public void setEmloyeeDepartment(String emloyeeDepartment) {
	this.emloyeeDepartment = emloyeeDepartment;
}
}
