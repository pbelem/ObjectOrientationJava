package entities.account;

public class BusinessAccount extends Account{

    private Double loanLimit = 0.0;

    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    public void loan(Double amount) {
        if (amount < loanLimit) {
            deposit(amount);
        }
    }
}
