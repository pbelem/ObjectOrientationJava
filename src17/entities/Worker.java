package entities;

import enums.WorkerLevel;
import service.HourContract;

import java.time.LocalDate;

public class Worker {

    String name;
    WorkerLevel level;
    double baseSalary;
    Department department;
    HourContract contract;

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contract.setContract(contract);
    }

    public void removeContract(HourContract contract) {

    }

    public double income(LocalDate date) {

        return 0;
    }

}
