package org.lessons.java.snack2;

public class bankAccount {
	private int accountNumber;
	private float balance;

	public bankAccount(int accountNumber, float balance) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public float withdraw(float amount) {
		this.balance = balance - amount;
		return balance;
	}

	public float deposit(float amount) {
		this.balance = balance + amount;
		return balance;
	}

}
