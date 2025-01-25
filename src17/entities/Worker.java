package entities;

import service.HourContract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Worker {

    String name;
    String workerLevel;
    double baseSalary;

    Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, String workerLevel, double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(String workerLevel) {
        this.workerLevel = workerLevel;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
//            int c_day = cal.get(Calendar.YEAR);
//            int c_month = cal.get(Calendar.MONTH) + 1;
            if (cal.get(Calendar.YEAR) == year && 1 + cal.get(Calendar.MONTH) == month) {
//            if (c_day == year && c_month == month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }

}
