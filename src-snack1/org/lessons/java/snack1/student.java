package org.lessons.java.snack1;

public class student {

	private String firstName;
	private String lastName;
	private int age;

	public student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getStudentInfo() {
		return this.firstName + " " + this.lastName + ", " + this.age + " anni";
	}

}
