package lists;

import entities.employee.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmployeeList {

    private final List<Employee> employeeList = new LinkedList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    public void displayList() {
        for (Employee emp : employeeList) {
            System.out.printf("%s - $ %.2f%n", emp.getNameEmployee(), emp.payment());
        }
    }
}