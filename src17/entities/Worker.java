package entities;

import Enums.WorkerLevel;
import Service.HourContract;

public class Worker {

    String name;
    WorkerLevel level;
    double baseSalary;
    Department department;

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {

    }

    public void removeContract(HourContract contract) {

    }

    public double income() {
        return 0;
    }

}
