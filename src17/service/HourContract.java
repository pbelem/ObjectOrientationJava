package service;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private double valuePerHour;
    private int hours;

    HourContract contract;

    public void setContract(HourContract contract) {
        this.contract = contract;
    }

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return hours * valuePerHour;
    }

}
