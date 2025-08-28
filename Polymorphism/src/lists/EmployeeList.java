package lists;

import entities.employee.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmployeeList {

    List<Employee> EmployeeList = new LinkedList<>();

    public void addEmployee(Employee emp) {
        EmployeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        EmployeeList.remove(emp);
    }

    public void displayList() {
        for (Employee emp : EmployeeList) {
            System.out.println("Employee name: " + emp.getNameEmployee() + "\nand employee payment: " + emp.payment());
        }
    }

}
