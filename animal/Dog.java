package animal;

import interfaces.Motion;

public class Dog extends Mammal implements Motion {
	public String dogsTestString = "I am dog's test String";

	/*
	 * public static void gotToMove() { System.out.println("This static method
	 * cannot hide the instance method from Motion. You'd have to remove static.");
	 * }
	 */

	public void gotToMove() {
		System.out.println("Duplicate method gotToMove() in type Dog.");
	}

}
