
public class Root {
public static void main(String s[])
{
	
Employee e1=new Employee(1,"arti","cse");
int empid=e1.getEmployeeId();
String empname=e1.getEmployeeName();
String dept=e1.getEmloyeeDepartment();
System.out.println("Employee Id is  "+empid);
System.out.println("Employee Department is  "+dept);
System.out.println("Employee name is  "+empname);

e1.setEmloyeeDepartment("Electrical");
String changesdept=e1.getEmloyeeDepartment();
System.out.println("Changed Department is"+changesdept);
}
}
