package org.lessons.java.snack2;

public class bankAccount {
	private int accountNumber;
	private float balance;

	public bankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	//method that returns the account number
	public int getAccountNumber() {
		return accountNumber;
	}

//method that subtracts the amount from the balance
	public void withdraw(float amount) {
		this.balance -= amount;
	}

	//method that adds the amount to the balance
	public void deposit(float amount) {
		this.balance += amount;
	}

	//method that prints the balance with two decimal places
	public String humanBalance() {
		return String.format("Your balance is: € %.2f", this.balance);
	}

}
