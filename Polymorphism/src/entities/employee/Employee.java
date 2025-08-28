package entities.employee;

public class Employee {

    private String nameEmployee;
    private Integer hours;
    private Double valuePerHour;

    public Employee(String nameEmployee, Integer hours, Double valuePerHour) {
        this.nameEmployee = nameEmployee;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }
}

