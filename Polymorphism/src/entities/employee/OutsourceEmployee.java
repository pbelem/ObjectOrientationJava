package entities.employee;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge = 0.0;

    public OutsourceEmployee(String nameEmployee, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(nameEmployee, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return (super.getValuePerHour() * super.getHours()) + (additionalCharge * 1.1);
    }
}
