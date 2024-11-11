package entities;

public class Account {

	private int number;
	private String holder;
	private Double balance;

	public Account(int number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double ammount) {
		balance += ammount;
	}
	public void withDrawn(Double ammount) {
		balance -= ammount + 5;
	}
	public String toString() {
		return "Account "
				+ number
				+ ", Holder"
				+ holder
				+ ", balance $ "
				+ String.format("%.2f", balance);
	}
}