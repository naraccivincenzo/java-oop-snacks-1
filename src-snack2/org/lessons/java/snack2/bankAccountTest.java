package org.lessons.java.snack2;

public class bankAccountTest {

	public static void main(String[] args) {
		bankAccount test1 = new bankAccount(1224);

		System.out.println(test1.getAccountNumber());
		System.out.println(test1.humanBalance());
		test1.deposit(1000f);
		System.out.println(test1.humanBalance());
		test1.withdraw(500f);
		System.out.println(test1.humanBalance());
		System.out.println(test1.humanBalance());
	}
}
