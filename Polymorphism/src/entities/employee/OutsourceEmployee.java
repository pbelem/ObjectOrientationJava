package entities.employee;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge = 1.1;

    public OutsourceEmployee(String nameEmployee, Integer hours, Double valuePerHour) {
        super(nameEmployee, hours, valuePerHour);
    }

    @Override
    public Double payment() {
        return (super.getValuePerHour() * super.getHours()) * additionalCharge;
    }
}
