package co.niit.myblog.repository;

import org.springframework.stereotype.Repository;

import co.niit.myblog.model.Employee;
import co.niit.myblog.model.Employees;

@Repository
public class EmplyeeDAO {
	private static Employees list = new Employees();
    
    static
    {
        list.getEmployeeList().add(new Employee(1, "Raj", "gs", "rajgs@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
