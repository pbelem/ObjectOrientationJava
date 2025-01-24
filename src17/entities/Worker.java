package entities;

import enums.WorkerLevel;
import service.HourContract;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    String name;
    WorkerLevel level;
    double baseSalary;
    HourContract contract;
    Department department;

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setDepartmentName(Department department) {
        this.department.setDepartmentName(department);
    }

    public void addContract(HourContract contract) {
        contract.setContract(contract);
    }

    public void removeContract(HourContract contract) {
        contract.setContract(null);

    }

    public double income(LocalDate date) {

        int month = date.getMonthValue();
        int year = date.getYear();

        return contract.totalValue();
    }

}
