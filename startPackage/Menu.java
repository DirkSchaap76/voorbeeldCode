package startPackage;

import java.util.Scanner;

import practiceStuff.Primitve;

public class Menu {

	public void mainMenu() {

		System.out.println("This will become a menu, with options and exceptions.");
		System.out.print("Choose option 1, 2 or 3. Choose q to close.");
		System.out.println();
		System.out.println("option 1 shows what happens when you do: char d = 2 -1; ");
		System.out.println();

		while (true) {
			Scanner input = new Scanner(System.in);
			String choice = input.next();

			switch (choice) {

			case "1":
				System.out.println("You choce option one.");
				Primitve p = new Primitve();
				System.out.println("the value of d is: " + p.d);

				break;
			case "2":
				System.out.println("You chose option two.");
				break;
			case "3":
				System.out.println("You chose option three.");
				break;
			case "q":
				System.out.println("Program ended.");
				System.exit(0);
				input.close();
				break;
			default:
				System.out.println("Wrong choice. Try again.");
				break;
			}

		}
	}
}
