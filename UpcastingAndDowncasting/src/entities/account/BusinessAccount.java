package entities.account;

public class BusinessAccount extends Account{

    private Double loanLimit = 0.0;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount < loanLimit) {
            deposit(amount);
        }
    }
@Override
    public final void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
