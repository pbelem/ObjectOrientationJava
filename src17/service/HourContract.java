package service;

import entities.Worker;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private double valuePerHour;
    private int hours;
    private double totalIncome;

    public HourContract() {}

    public void setContract(HourContract contract) {
        this.date = contract.date;
        this.valuePerHour = contract.valuePerHour;
        this.hours = contract.hours;
    }

    public double totalValue() {
        totalIncome += (hours * valuePerHour);
        return totalIncome;
    }

}
