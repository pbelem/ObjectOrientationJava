package util;

import lists.EmployeeList;


public class Write {

    static EmployeeList employeeList = Read.employeeList;

    public static void EmployeeData() {

        employeeList.displayList();

    }
}
