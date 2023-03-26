package com.oopanimals;

public class Main {

	public static void main(String[] args) {
		Animals[] masAnimals = new Animals[5];
		masAnimals[0] = new Animals();
		masAnimals[1] = new Cat();
		masAnimals[2] = new Dog();
		masAnimals[3] = new Animals();
		masAnimals[4] = new Cat();

		for (int i = 0; i < 5; i++) {
			masAnimals[i].say();
			masAnimals[i].runAnimals();
		}
		
		
		//ArrayList<Animals> list = new ArrayList<Animals>();
		
		//****************************************************************
		
	}
}