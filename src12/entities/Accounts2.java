package entities;

public class Accounts2 {

	private int accountNum;
	private String nameAccount;
	private Double currentValue;

	public Accounts2() {

	}

	public Accounts2(Double currentValue) {
		this.currentValue = currentValue;
	}

	public Accounts2(int accountNum, String nameAccount, Double initialDeposit) {
		this.accountNum = accountNum;
		this.nameAccount = nameAccount;
		this.currentValue = initialDeposit;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}

	public String toString() {
		return String.format("Account data:%nAccount %s, Holder %s, Balance %.2f", accountNum, nameAccount,
				currentValue);

	}

}