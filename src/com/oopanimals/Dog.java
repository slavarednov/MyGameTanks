package com.oopanimals;

public class Dog extends Animals {
	private static int count = 0;

	public Dog() {
		System.out.println("object is cread");
		count++;
	}

	public void say() {
		super.say();
		System.out.println("гав-гав");
	}

	public int getCout() {
		return count;
	}
}